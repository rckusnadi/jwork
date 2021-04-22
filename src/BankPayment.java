import java.text.*;

/**
 * Write a description of class BankPayment here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BankPayment extends Invoice
{
    private static final PaymentType PAYMENT_TYPE = PaymentType.BankPayment;
    private int adminFee;
    
    public BankPayment(int id, Job job, Jobseeker jobseeker, InvoiceStatus invoiceStatus)
    {
        super(id, job, jobseeker, invoiceStatus);
    }
    public BankPayment(int id, Job job, Jobseeker jobseeker, InvoiceStatus invoiceStatus, int adminFee)
    {
        super(id, job, jobseeker, invoiceStatus);
        this.adminFee = adminFee;
    }
    public PaymentType getPaymentType()
    {
        return PAYMENT_TYPE;
    }
    public int getAdminFee()
    {
        return adminFee;
    }
    public void setAdminFee(int adminFee)
    {
        this.adminFee = adminFee;
    } 
    public void setTotalFee()
    {
         if (adminFee != 0){
            totalFee = totalFee - adminFee;
        }
        else{
            totalFee = totalFee;
        }
    }
    /*public void printData()
    {System.out.println(
                    "===================== INVOICE =====================" +
                            "\nID: " + getId() +
                            "\nJob: " + getJob().getName() +
                            "\nDate: " + getDate() +
                            "\nJob Seeker: " + getJobseeker().getName() +
                            "\nAdmin Fee: " + getAdminFee() +
                            "\nTotal Fee: " + getJob().getFee() +
                            "\nStatus : " + getInvoiceStatus() +
                            "\nPayment Type: " + PAYMENT_TYPE);
    }*/
    public String toString() {
    if (getDate() == null) {
            return  "===================== INVOICE =====================" + "\nId = " + getId() + "\nJob = " + getJob().getName() + "\nDate = " + getDate() + "\nJob Seeker = "
                    + getJobseeker().getName() + "\nAdmin Fee = " + getAdminFee() + "\nTotal Fee" + getJob().getFee() +
                    "\nStatus : " + getInvoiceStatus() + "\nPayment Type: " + PAYMENT_TYPE;
        } else {
            SimpleDateFormat formattedDate = new SimpleDateFormat("dd-MMMM-yyyy");
            String date = formattedDate.format(getDate().getTime());
            return "Id = " + getId() + "\nJob = " + getJob().getName() + "\nDate = " + getDate() + "\nJob Seeker = "
                    + getJobseeker().getName() + "\nAdmin Fee = " + getAdminFee() + "\nTotal Fee" + getJob().getFee() +
                    "\nStatus : " + getInvoiceStatus() + "\nPayment Type: " + PAYMENT_TYPE;
        }
    }}
