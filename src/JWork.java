import java.util.Calendar;
import java.util.regex.*;
import java.util.GregorianCalendar;
import java.text.*;
public class JWork
{
    // instance variables - replace the example below with your own
    /*
     *
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    
    
    public static void main(String[] args){

        Location location = new Location("JawaBarat", "Bandung", "KotaKembang");
        DatabaseRecruiter.addRecruiter(new Recruiter(1, "ricky", "ricky@gmail.com", "089018084", location));
        DatabaseJob.addJob(new Job(13, "Designer",DatabaseRecruiter.getRecruiterById(1) , 12000000, jobCategory.WebDeveloper));
        DatabaseJob.addJob(new Job(15, "Designer",DatabaseRecruiter.getRecruiterById(1) , 14000000, jobCategory.WebDeveloper));
        DatabaseJob.addJob(new Job(12, "Analyst",DatabaseRecruiter.getRecruiterById(1) , 12000000, jobCategory.DataAnalyst));
        DatabaseJobseeker.addJobseeker(new Jobseeker(1, "Ricky", "ricky82@ui.ac.id ", "maskus123", new GregorianCalendar(2002, 5, 12)));
        DatabaseJobseeker.addJobseeker(new Jobseeker(2, "Ricky", "ricky@ui.ac.id", "ksunadi123", 2002, 1, 27));
        DatabaseJobseeker.addJobseeker(new Jobseeker(3, "Mustofa", "mustofa@ui.ac.id", "kusnadi123"));
        System.out.println("\n=====================Jobseeker Database====================\n");
        System.out.println(DatabaseJobseeker.getDatabaseJobseeker());
        System.out.println("\n=====================Job Database By Category====================\n");
        System.out.println(DatabaseJob.getJobByCategory(jobCategory.WebDeveloper));



    }
        
        
    }
