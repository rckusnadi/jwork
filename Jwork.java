
public class Jwork
{
    public static void main(String[] args) {
    Location location = new Location ("","","");
    Recruiter recruiter = new Recruiter (1,"","","",location);
    Job job = new Job (1,"",recruiter,2,"");
    Jobseeker jobseeker = new Jobseeker(1,"","","","");
    Invoice invoice = new Invoice (1,2,"",3,jobseeker);
    location.setProvince("Jabar");
    recruiter.setName("Ricky");
    job.setFee(500000);
    jobseeker.setName("Ricky");
    invoice.setTotalFee(400000);
    
    location.printData();
    recruiter.printData();
    job.printData();
    jobseeker.printData();
    invoice.printData();
       
    }
}
