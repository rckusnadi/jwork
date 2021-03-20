public class DatabaseJob
{
    /*
    *
    * @author : Ricky
    * @version : 18/03/2021
    */
    private String[] listJob;
    private Job job;

    public DatabaseJob() { }
    public boolean addJob(Job job) { return true; }
    public boolean removeJob(Job job) { return false; }
    public Job getJob() { return job; }
    public String[] getListJob() { return listJob; }
   
}