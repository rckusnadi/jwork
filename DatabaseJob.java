public class DatabaseJob
{
    private String[] listJob;

    public DatabaseJob() { }
    public boolean addJob(Job job) { return true; }
    public boolean removeJob(Job job) { return false; }
    public Job getJob() { return job; }
    public String[] getListJob() { return listJob; }
}