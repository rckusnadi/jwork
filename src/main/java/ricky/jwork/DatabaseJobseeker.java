package ricky.jwork;

/*
 *
 *
 *
 * @Ricky
 * @25-03-2021
 */
import java.util.ArrayList;

public class DatabaseJobseeker
{
    private static ArrayList<Jobseeker> JOBSEEKER_DATABASE = new ArrayList<Jobseeker>();
    private static int lastId = 0;

    public static ArrayList<Jobseeker> getDatabaseJobseeker()
    {
        return JOBSEEKER_DATABASE;
    }

    public static int getLastId() {
        return lastId;
    }

    public static Jobseeker getJobseekerLogin(String email, String password){
        for (Jobseeker jobseeker : JOBSEEKER_DATABASE) {
            if (jobseeker.getEmail().equals(email) && jobseeker.getPassword().equals(password)) {
                return jobseeker;
            }
        }
        return null;
    }

    public static Jobseeker getJobseekerById(int id) throws JobSeekerNotFoundException{
        Jobseeker temp = null;
        try{
            for (Jobseeker jobseeker : JOBSEEKER_DATABASE) {
                if (id == jobseeker.getId()) {
                    temp = jobseeker;
                }
            }
        }
        catch (Exception e){
            throw new JobSeekerNotFoundException(id);
        }
        return temp;
    }

        public static boolean addJobseeker(Jobseeker jobseeker) throws EmailAlreadyExistsException {
            boolean result = false;
            for (Jobseeker js : JOBSEEKER_DATABASE) {
                if (jobseeker.getEmail() == js.getEmail()) {
                    throw new EmailAlreadyExistsException(jobseeker);
                }
            }
            JOBSEEKER_DATABASE.add(jobseeker);
            lastId = jobseeker.getId();
            return true;
        }

    public static boolean removeJobseeker(int id) throws JobSeekerNotFoundException{
        try{
            for (Jobseeker jobseeker : JOBSEEKER_DATABASE) {
                if (jobseeker.getId() == jobseeker.getId()) {
                    JOBSEEKER_DATABASE.remove(jobseeker);
                    return true;
                }
            }
        }
        catch (Exception e){
            throw new JobSeekerNotFoundException(id);
        }
        return false;
    }

}