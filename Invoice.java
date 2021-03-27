public class Invoice
{
    /*
     *
     * @author : Ricky
     * @version : 27/03/2021
     */
    private int id;
    private int idJob;
    private String date;
    private int totalFee;
    private Jobseeker jobseeker;
    private PaymentType paymentType; 
    private InvoiceStatus status;

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

    public Invoice(int id, int idJob, String date, int totalFee, Jobseeker jobseeker, PaymentType paymentType, InvoiceStatus status) {
        this.id = id;
        this.idJob = idJob;
        this.date = date;
        this.totalFee = totalFee;
        this.jobseeker = jobseeker;
        this.paymentType = paymentType;
        this.status = status;
    }

    public int getId() { return id; }
    
    public int getIdJob() { return idJob; }
    
    public String getDate() { return date; }
    
    public int getTotalFee() { return totalFee; }

    public Jobseeker getJobseeker() { return jobseeker; }
    
    public PaymentType getPaymentType(){ return paymentType; }

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

    public void setJobseeker(Jobseeker jobseeker) { this.jobseeker = jobseeker; }

    public void setId(int id){ this.id = id; }
    
    public void setIdJobs(int idJobs){ this.idJob = idJobs; }
    
    public void setDate(String date){ this.date = date; }
    
    public void setTotalFee(int totalFee){ this.totalFee = totalFee; }
    
    public void setPaymentType(PaymentType paymentType) { this.paymentType = paymentType; }

    public void setInvoiceStatus(InvoiceStatus status) { this.status = status; }

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

    public void printData(){
        System.out.println("===================== JOB =====================");
        System.out.println("ID: " + getId());
        System.out.println("ID Job: " + getIdJob());
        System.out.println("Date: " + getDate());
        System.out.println("Seeker: " + jobseeker.getName());
        System.out.println("Fee: " + getTotalFee());
        System.out.println("Status: " + status);
    }

     

}
