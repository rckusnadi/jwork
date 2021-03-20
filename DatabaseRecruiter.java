public class DatabaseRecruiter
{
    /*
     *
     * 
     *
     * @author Ricky
     * @version 20-03-2021
     */
    private String listRecruiter;
    private Recruiter recruiter;

    /**
     * Constructor for objects of class DatabaseRecruiter
     */
    public DatabaseRecruiter()
    {
        
    }
    public boolean addRecruiter(Recruiter recruiter){
        return true;
        
    }
    public boolean removeRecruiter(Recruiter recruiter){
        return false;
    }
    public Recruiter getRecruiter(){
        return recruiter;
    }
    public String getListRecruiter(){
        return listRecruiter;
    }
    public void setRecruiter(Recruiter recruiter){
        this.recruiter = recruiter;
    }
    public void setListRecruiter(String listRecruiter){
        this.listRecruiter = listRecruiter;
    }

    
}
