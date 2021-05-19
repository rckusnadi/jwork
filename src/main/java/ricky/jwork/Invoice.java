package ricky.jwork;

import java.util.*;

public abstract class Invoice
{
    /*
     *
     * @author : Ricky
     * @version : 27/03/2021
     */
    private int id;
    ArrayList<Job> jobs = new ArrayList<>();
    private Calendar date;
    protected int totalFee;
    private Jobseeker jobseeker;
    private InvoiceStatus invoiceStatus;

    /*
     *
     * Constructor for objects of class Invoice
     * @param id merupakan id dari Invoice
     * @param idJob id dari job
     * @param date adalah tanggal invoice dicetak
     * @param totalFee adalah jumlah total pembayaran
     * @param jobSeeker adalah pointer objek jobSeeker
     *
     */

    public Invoice(int id, ArrayList<Job> jobs, Jobseeker jobseeker) {
        this.id = id;
        this.jobs = jobs;
        this.jobseeker = jobseeker;

    }

    public int getId() {

        return id;
    }

    public ArrayList<Job> getJobs()
    {
        return jobs;
    }
    
    public Calendar getDate() {

        return date;
    }
    
    public int getTotalFee() {

        return totalFee;
    }

    public Jobseeker getJobseeker() {

        return jobseeker;
    }

    public abstract PaymentType getPaymentType();

    public InvoiceStatus getInvoiceStatus() {

        return invoiceStatus;
    }

    /*
     *
     * Getter id
     * @return id dari data terkait
     * Getter idjob
     * @return idJob dari data terkait
     * Getter date
     * @return date dari data terkait
     * Getter TotalFee
     * @return totalfee dari data terkait
     * Getter jobseeker
     * @return jobseeker dari data terkait
     */

    public void setJobseeker(Jobseeker jobseeker) {

        this.jobseeker = jobseeker;
    }

    public void setId(int id){

        this.id = id;

    }

    public void setJobs(ArrayList<Job> jobs) {

        this.jobs = jobs;

    }
    
    public void setDate(Calendar date){

        this.date = date;
    }
    
    public void setDate(int year, int month, int dayOfMonth){
    
        this.date=new GregorianCalendar(year, month, dayOfMonth);
    }

    public void setTotalFee(int totalFee){

        this.totalFee = totalFee;
    }
    

    public void setInvoiceStatus(InvoiceStatus invoiceStatus) {

        this.invoiceStatus = invoiceStatus;
    }

    public abstract void setTotalFee();
    /*
     *
     * Setter id
     * @return nilai baru id dari data terkait
     * Setter idjob
     * @return nilai baru idJob dari data terkait
     * Setter date
     * @return nilai baru date dari data terkait
     * Setter TotalFee
     * @return nilai baru totalfee dari data terkait
     * Setter jobseeker
     * @return nilai baru jobseeker dari data terkait
     */

    public String toString() {
        return "";
    }

}
