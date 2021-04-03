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
        Jobseeker jobseeker = new Jobseeker(2, "Siti", "siti77@gmail.com", "siti155", "2 Maret 2020");
        //Invoice invoice = new Invoice(4, 3, "2 Juli 2020", 2000000, jobseeker);

        //recruiter.getName();
        //recruiter.setName("MK");
        //recruiter.getName();
        //recruiter.printData();
        //job.printData();

        Location location1 = new Location("Jawabarat","Bandung","KotaSejuk");
        Recruiter recruiter = new Recruiter(12, "Kusnadi", "rickykusnadi@gmail.com", "0812233445", location1);
        Job job = new Job(13, "Designer", recruiter, 12000000, jobCategory.WebDeveloper);
        //Invoice invoice = new Invoice(4, job.getId(), "2 April 2020", job.getFee(), jobseeker,PaymentType.EwalletPayment, InvoiceStatus.Finished);
        //invoice.printData();
        //Bonus bonus = new Bonus(143, "rck22", 10000, 30000000, true);
        //Bonus bonus1 = new Bonus(122, "rck22", 20000, 40000, true);

        //EwalletPayment wallet1 = new EwalletPayment(11, job, "01 April 2021", jobseeker, InvoiceStatus.Cancelled);
        //EwalletPayment wallet2 = new EwalletPayment(22, job, "04 April 2021", jobseeker, bonus, InvoiceStatus.Finished);
        //EwalletPayment wallet3 = new EwalletPayment(33, job, "05 April 2021", jobseeker, bonus1, InvoiceStatus.Finished);
        
        BankPayment bank1 = new BankPayment(11, job, "03 April 2021", jobseeker, InvoiceStatus.Finished);
        BankPayment bank2 = new BankPayment(11, job, "03 April 2021", jobseeker, InvoiceStatus.Finished);
        BankPayment bank3 = new BankPayment(11, job, "03 April 2021", jobseeker, InvoiceStatus.Finished);


        //wallet1.printData();
        //wallet2.printData();
        //wallet3.printData();
        
        
        
    }
}