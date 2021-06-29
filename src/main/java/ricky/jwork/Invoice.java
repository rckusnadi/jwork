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

    /**
            * Constructor for objects of class Invoice
     * @param id berisi data id invoice
     * @param jobs berisi data idJob invoice
     * @param jobseeker merujuk pada list jobseeker
     */
    public Invoice(int id, ArrayList<Job> jobs, Jobseeker jobseeker)
    {
        this.id = id;
        this.jobs = jobs;
        this.jobseeker = jobseeker;
        this.date = Calendar.getInstance();
    }

    /**
     * method ini digunakan untuk mengambil data id invoice
     * @return void
     */
    public int getId()
    {
        return id;
    }
    /**
     * method ini digunakan untuk mengambil data idjob invoice
     * @return void
     */
    public ArrayList<Job> getJobs(){
        return jobs;
    }
    /**
     * method ini digunakan untuk mengambil data date invoice
     * @return void
     */
    public Calendar getDate()
    {
        return date;
    }
    /**
     * method ini digunakan untuk mengambil data total fee invoice
     * @return void
     */
    public int getTotalFee()
    {
        return totalFee;
    }
    /**
     * method ini digunakan untuk mengambil data jobseeker invoice
     * @return void
     */
    public abstract PaymentType getPaymentType();
    /**
     * method ini digunakan untuk mengambil data jobseeker invoice
     * @return void
     */
    public InvoiceStatus getInvoiceStatus()
    {
        return invoiceStatus;
    }
    /**
     * method ini digunakan untuk mengambil data jobseeker invoice
     * @return void
     */
    public Jobseeker getJobseeker()
    {
        return jobseeker;
    }
    /**
     * method ini digunakan untuk melakukan set nilai pada id invoice
     * @param id
     */
    public void setId(int id)
    {
        this.id = id;
    }
    /**
     * method ini digunakan untuk melakukan set nilai pada idjob invoice
     * @param jobs
     */
    public void setJob(ArrayList<Job> jobs)
    {
        this.jobs = jobs;
    }
    /**
     * method ini digunakan untuk melakukan set nilai pada waktu invoice
     * @param date
     */
    public void setDate(Calendar date)
    {
        this.date = Calendar.getInstance();
    }
    public void setDate(int year, int month, int dayOfMonth)
    {
        this.date = new GregorianCalendar(year, month-1, dayOfMonth);
    }
    /**
     * method ini digunakan untuk melakukan set nilai pada total fee invoice
     */
    public abstract void setTotalFee();
    /**
     * method ini digunakan untuk melakukan set nilai pada jobseeker invoice
     * @param jobseeker
     */
    public void setJobseeker(Jobseeker jobseeker)
    {
        this.jobseeker = jobseeker;
    }
    /**
     * method ini digunakan untuk melakukan set nilai pada jobseeker invoice
     * @param InvoiceStatus
     */
    public void setInvoiceStatus(InvoiceStatus InvoiceStatus)
    {
        this.invoiceStatus = InvoiceStatus;
    }
    public abstract String toString();
}



