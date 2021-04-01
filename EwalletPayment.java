/*
 *
 * Merupakan class untuk Ewallet Payment
 * @author Ricky
 * @version 25 Maret 2021
 */
public class EwalletPayment extends Invoice
{
    private Bonus bonus;
    private static final PaymentType PAYMENT_TYPE = PaymentType.EwalletPayment;

    public EwalletPayment(int id, Job job, String date, Jobseeker jobseeker, InvoiceStatus invoiceStatus)
    {
        super(id, job, date, jobseeker, invoiceStatus);
    }

    public EwalletPayment(int id, Job job, String date, Jobseeker jobseeker, Bonus bonus ,InvoiceStatus invoiceStatus)
    {
        super(id, job, date, jobseeker, invoiceStatus);
        this.bonus = bonus;
    }

    public PaymentType getPaymentType()
    {
        return PAYMENT_TYPE;
    }

    public void setBonus(Bonus bonus)
    {
        this.bonus = bonus;
    }

    public void setTotalFee(){
        if((bonus != null) && (bonus.getActive() == true) && (totalFee > bonus.getMinTotalFee())){
            super.totalFee = getJob().getFee() + bonus.getExtraFee();
        } else {
            super.totalFee = getJob().getFee();
        }
    }

    public void printData()
    {
            System.out.println(
                    "===================== INVOICE =====================" +
                            "\nID: " + getId() +
                            "\nJob: " + getJob().getName() +
                            "\nDate: " + getDate() +
                            "\nJob Seeker: " + getJobseeker().getName());
            if (bonus != null && (bonus.getActive() == true) && getJob().getFee() > bonus.getMinTotalFee()) {
                System.out.println("ReferralCode: " + bonus.getReferralCode());
            }
            setTotalFee();
            System.out.println(
                            "Fee: " + getTotalFee() +
                            "\nStatus: " + getInvoiceStatus() +
                            "\nPayment Type: " + PAYMENT_TYPE);
        }

    }
