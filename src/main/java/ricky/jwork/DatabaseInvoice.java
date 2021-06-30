package ricky.jwork;
import java.util.ArrayList;
/*
 *
 * Merupakan class untuk Ewallet Payment
 * @author Ricky
 * @version 24 April 2021
 */

public class DatabaseInvoice {
    private static ArrayList<Invoice> INVOICE_DATABASE = new ArrayList<Invoice>();
    private static int lastId = 0;

    public static ArrayList<Invoice> getInvoiceDatabase(){
        return INVOICE_DATABASE;
    }

    public static int getLastId(){
        return lastId;
    }

    public static Invoice getInvoiceById(int id) throws InvoiceNotFoundException {
        Invoice result = null;
        for (Invoice invoice : INVOICE_DATABASE) {
            if (id == invoice.getId()) {
                result = invoice;
            } else {
                result = null;
            }
        }
        if (result == null){
            throw new InvoiceNotFoundException(id);
        }

        return result;
    }

    public static ArrayList<Invoice> getInvoiceByJobseeker(int jobseekerid){
        ArrayList<Invoice> temp = new ArrayList<Invoice>();
        for (int i = 0; i < INVOICE_DATABASE.size(); i++) {
            if (jobseekerid == INVOICE_DATABASE.get(i).getJobseeker().getId()) {
                temp.add(INVOICE_DATABASE.get(i));
            }
        }
        return temp;
    }

    public static boolean addInvoice(Invoice invoice) throws OngoingInvoiceAlreadyExistsException{
        for (Invoice invoices : INVOICE_DATABASE) {
            if (invoices.getInvoiceStatus() == InvoiceStatus.OnGoing) {
                throw new OngoingInvoiceAlreadyExistsException(invoice);
            }
        }
        INVOICE_DATABASE.add(invoice);
        lastId = invoice.getId();
        return true;
    }

    public static boolean changeInvoiceStatus(int id,InvoiceStatus invoiceStatus){
        boolean tempBool = true;
        for (Invoice invoice: INVOICE_DATABASE) {
            if (id == invoice.getId()){
                invoice.setInvoiceStatus(InvoiceStatus.OnGoing);
                tempBool = true;
            }
            else{
                tempBool = false;
            }
        }
        return tempBool;
    }

    public static boolean removeInvoice(int id) throws InvoiceNotFoundException{
        boolean tempBool = false;
        for (Invoice invoice: INVOICE_DATABASE) {
            if (id == invoice.getId()){
                INVOICE_DATABASE.remove(id);
                tempBool = true;
                break;
            }
        }
        if (!tempBool) {
            throw new InvoiceNotFoundException(id);
        }
        return tempBool;
    }
}
