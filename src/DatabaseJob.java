import java.util.ArrayList;

/*
    *
    * @author : Ricky
    * @version : 18/03/2021
    */
public class DatabaseJob {

    // listjob variable

    private static ArrayList<Job> JOB_DATABASE = new ArrayList<Job>();
    private static int lastId = 0;

    public static ArrayList<Job> getJobDatabase() {
        return JOB_DATABASE;
    }

    public static int getLastId() {
        return lastId;
    }

    public static Job getJobById(int id) throws JobNotFoundException {
        Job temp = null;

        try{
            for (Job job : JOB_DATABASE) {
                if (id == job.getId()) {
                    temp = job;
                }
            }
        }
        catch (Exception e){
            throw new JobNotFoundException(id);
        }
        return temp;
    }

    public static ArrayList<Job> getJobByRecruiter(int recruiterId) {
        ArrayList<Job> temp = new ArrayList<Job>();
        for (int i = 0; i < JOB_DATABASE.size(); i++) {
            if (recruiterId == JOB_DATABASE.get(i).getRecruiter().getId()) {
                temp.add(JOB_DATABASE.get(i));
            } else {
                return null;
            }
        }
        return temp;

    }

    public static ArrayList<Job> getJobByCategory(jobCategory category) {
        ArrayList<Job> temp = new ArrayList<Job>();
        for (int i = 0; i < JOB_DATABASE.size(); i++) {
            if (category == JOB_DATABASE.get(i).getCategory()) {
                temp.add(JOB_DATABASE.get(i));
            }
        }
        return temp;
    }


    public static boolean addJob(Job job) {
        JOB_DATABASE.add(job);
        lastId = job.getId();
        return true;
    }


    public static boolean removeJob(int id) throws JobNotFoundException{
        try{
            for (Job jobb : JOB_DATABASE) {
                if (id == jobb.getId()) {
                    JOB_DATABASE.remove(id);
                    return true;
                }
            }
        }
        catch (Exception e) {
            throw new JobNotFoundException(id);
        }
        return false;
    }

    // Access method to fetch a specific existing Job
}
