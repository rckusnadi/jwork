import java.util.ArrayList;
/*
 *
 * Merupakan class untuk Ewallet Payment
 * @author Ricky
 * @version 24 April 2021
 */

public class DatabaseInvoice {
    private static ArrayList<Invoice> INVOICE_DATABASE = new ArrayList<Invoice>();
    private static int lastId;

    public static ArrayList<Invoice> getInvoiceDatabase() {
        return INVOICE_DATABASE;
    }

    public static int getLastId() {
        return lastId;
    }

    public static Invoice getInvoiceById(int id) throws InvoiceNotFoundException{
        Invoice val = null;
        try
        {
            for (Invoice invc : INVOICE_DATABASE)
            {
                if (id == invc.getId())
                {
                    val = invc;
                }
            }
        }
        catch (Exception error)
        {
            throw new InvoiceNotFoundException(id);
        }
        return val;
    }


    public static ArrayList<Invoice> getInvoiceByJobseeker(int jobseekerId) {
        ArrayList<Invoice> temp = null;
        for (Invoice invoice : INVOICE_DATABASE) {
            if (jobseekerId == invoice.getJobseeker().getId()) {
                if (temp == null) {
                    temp = new ArrayList<Invoice>();
                }
                temp.add(invoice);
            }
        }
        return temp;
    }

    public static boolean addInvoice(Invoice invoice) throws OngoingInvoiceAlreadyExistsException{
        for (Invoice invc : INVOICE_DATABASE)
        {
            if (invoice.getInvoiceStatus() == invc.getInvoiceStatus())
            {
                throw new OngoingInvoiceAlreadyExistsException(invoice);
            }
        }
        INVOICE_DATABASE.add(invoice);
        lastId = invoice.getId();
        return true;
    }

    public static boolean changeInvoiceStatus(int id, InvoiceStatus invoiceStatus) {
        boolean temp = true;
        for (Invoice invoice : INVOICE_DATABASE) {
            if (id == invoice.getId()) {
                invoice.setInvoiceStatus(InvoiceStatus.OnGoing);
                temp = true;
            } else {
                temp = false;
            }
        }
        return temp;
    }

    public static boolean removeInvoice(int id) throws InvoiceNotFoundException{
        for (Invoice invc : INVOICE_DATABASE)
        {
            if (invc.getId() == id)
            {
                INVOICE_DATABASE.remove(invc);
                return true;
            }
        }
        throw new InvoiceNotFoundException(id);
    }

}