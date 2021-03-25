public class JWork
{
    // instance variables - replace the example below with your own

    /*
     *
     * Constructor for objects of class JWork
     */
    public JWork()
    {
        
    }

    /*
     *
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    
    
    public static void main(String[] args){
        //Location location = new Location("JawaBarat", "Bandung", "KotaKembang");
        //Recruiter recruiter = new Recruiter(1, "ricky", "ricky@gmail.com", "089018084", location);
        //Job job = new Job(3, "Ahmad", recruiter, 200000, "Montir");
        //Jobseeker jobseeker = new Jobseeker(2, "Siti", "siti77@gmail.com", "siti155", "2 Maret 2020");
        //Invoice invoice = new Invoice(4, 3, "2 Juli 2020", 2000000, jobseeker);

        //recruiter.getName();
        //recruiter.setName("MK");
       // recruiter.getName();
        //recruiter.printData();
       // job.printData();

        Location location1 = new Location("Jawabarat","Bandung","KotaSejuk");
        Recruiter recruiter1 = new Recruiter(12, "Kusnadi", "rickykusnadi@gmail.com", "0812233445", location1);
        Job job1 = new Job(13, "Designer", recruiter1, 12000000, jobCategory.WebDeveloper);
        job1.printData();
    }
}