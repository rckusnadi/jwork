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

    public static Job getJobById(int id) {
        Job temp = null;
        for (int i = 0; i < JOB_DATABASE.size(); i++) {
            if (id == JOB_DATABASE.get(i).getId()) {
                temp = JOB_DATABASE.get(i);
            }
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


    public static boolean removeJob(int id) {
        for (Job job : JOB_DATABASE) {
            if (job.getId() == job.getId()) {
                JOB_DATABASE.remove(job);
                return true;
            }
        }
        return false;
    }

    // Access method to fetch a specific existing Job
}
