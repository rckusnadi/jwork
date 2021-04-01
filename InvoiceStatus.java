/*
 *
 * Enumeration class InvoiceStatus - write a description of the enum class here
 *
 * @Ricky
 * @27-03-2021
 */
public enum InvoiceStatus
{
    OnGoing("On Going"), 
    Finished("Finished"),
    Cancelled("Cancelled");
    
    private String invoicestatus;
    
    InvoiceStatus(String invoicestatus){

        this.invoicestatus = invoicestatus;
    }

    public String toString() {

        return invoicestatus;
    }
}
