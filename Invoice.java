public class Invoice
{
    /*
     *
     * @author : Ricky
     * @version : 18/03/2021
     */
    private int id;
    private int idJob;
    private String date;
    private int totalFee;
    private Jobseeker jobseeker;
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

    public Invoice(int id, int idJob, String date, int totalFee, Jobseeker jobseeker) {
        this.id = id;
        this.idJob = idJob;
        this.date = date;
        this.totalFee = totalFee;
        this.jobseeker = jobseeker;
    }

    public int getId() { return id; }
    
    public int getIdJob() { return idJob; }
    
    public String getDate() { return date; }
    
    public int getTotalFee() { return totalFee; }

    public Jobseeker getJobseeker() { return jobseeker; }

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

    public void printData(){}

     

}
