package ricky.jwork.controller;
import org.springframework.web.bind.annotation.*;
import ricky.jwork.*;
import java.util.ArrayList;
@RequestMapping("/invoice")
@RestController
public class InvoiceController {


    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Invoice getInvoiceById(@PathVariable int id) throws InvoiceNotFoundException {
        Invoice invoice = DatabaseInvoice.getInvoiceById(id);
        return invoice;
    }

    @RequestMapping(value = "/customer/{customerId}", method = RequestMethod.GET)
    public ArrayList<Invoice> getInvoiceByJobseeker (@PathVariable int jobseekerId) {
        return DatabaseInvoice.getInvoiceByJobseeker(jobseekerId);
    }

    @RequestMapping(value = "/invoiceStatus/{id}", method = RequestMethod.PUT)
    public Invoice changeInvoiceStatus(@RequestParam(value="id") int id,
                                       @RequestParam(value="invoiceStatus") InvoiceStatus invoiceStatus) throws InvoiceNotFoundException {
        DatabaseInvoice.changeInvoiceStatus(id, invoiceStatus);
        Invoice invoice = DatabaseInvoice.getInvoiceById(id);
        return invoice;
    }

    @RequestMapping(value = "/createBankPayment", method = RequestMethod.POST)
    public Invoice addBankPayment(@RequestParam(value = "jobIdList") ArrayList<Integer> jobIdList,
                                  @RequestParam(value = "jobseekerId") int jobseekerId,
                                  @RequestParam(value = "adminId") int adminFee){
        ArrayList<Job> job = new ArrayList<>();
        for (int jb : jobIdList) {
            try {
                job.add(DatabaseJob.getJobById(jb);
            } catch (JobNotFoundException e) {
                System.out.println(e.getMessage());
            }
        }
        try {
            Invoice invoice = new BankPayment(DatabaseInvoice.getLastId()+1, job,
                    DatabaseJobseeker.getJobseekerById(jobseekerId), adminFee);
            DatabaseInvoice.addInvoice(invoice);
            invoice.setTotalFee();
            return invoice;
        } catch (JobSeekerNotFoundException | OngoingInvoiceAlreadyExistsException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    @RequestMapping(value = "/createEWalletPayment", method = RequestMethod.POST)
    public Invoice addEWalletPayment(@RequestParam(value = "jobIdList") ArrayList<Integer> jobIdList,
                                     @RequestParam(value = "jobseekerId") int jobseekerId,
                                     @RequestParam(value = "referralCode") Bonus refferalCode){
        ArrayList<Job> job = new ArrayList<>();
        for (int jb : jobIdList) {
            try {
                job.add(DatabaseJob.getJobById(jb);
            } catch (JobNotFoundException e) {
                System.out.println(e.getMessage());
            }
        }
        try {
            Invoice invoice = new EwalletPayment(DatabaseInvoice.getLastId()+1, job,
                    DatabaseJobseeker.getJobseekerById(jobseekerId), DatabaseBonus.getBonusByRefferalCode(refferalCode));
            DatabaseInvoice.addInvoice(invoice);
            invoice.setTotalFee();
            return invoice;
        } catch (JobSeekerNotFoundException | OngoingInvoiceAlreadyExistsException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }




}