
public class Job
{

    /*
     *
     * @author : Ricky
     * @version : 18/03/2021
     */
    private int id;
    private String name;
    private int fee;
    private jobCategory category;
    private Recruiter recruiter;

    /*
     *
     * Constructor for objects of class Job
     * @param id merupakan id dari job
     * @param name merupakan name dari job
     * @param fee adalah besar pembayaran dari job
     * @param category adalah kategori job
     * @param recruiter adalah pointer objek recruiter
     *
     */

    public Job(int id, String name, Recruiter recruiter, int fee, jobCategory category) {
        this.id = id;
        this.name = name;
        this.recruiter = recruiter;
        this.fee = fee;
        this.category = category;

    }

    public int getId() { return id; }
    
    public String getName() { return name; }
    
    public int getFee() { return fee; }
    
    public jobCategory getCategory() { return category; }

    public Recruiter getRecruiter() { return recruiter; }
    /*
     *
     * Getter id
     * @return id dari data terkait
     * Getter name
     * @return name dari data terkait
     * Getter fee
     * @return fee dari data terkait
     * Getter category
     * @return category dari data terkait
     * Getter recruiter
     * @return recruiter dari data terkait
     */

    public void setRecruiter(Recruiter recruiter) { this.recruiter = recruiter; }
    
    public void setId(int id) { this.id = id; }
    
    public void setName(String name) { this.name = name; }
    
    public void setFee(int fee) { this.fee = fee; }
    
    public void setCategory(jobCategory category) { this.category = category; }
    /*
     *
     * Setter id
     * @return nilai baru id dari data terkait
     * Setter name
     * @return nilai baru name dari data terkait
     * Setter fee
     * @return nilai baru fee dari data terkait
     * Setter category
     * @return nilai baru category dari data terkait
     * Setter recruiter
     * @return nilai baru recruiter dari data terkait
     */

    public void printData(){
        System.out.println("==========JOB==========");
        System.out.println("ID:" + id);
        System.out.println("Name:" + name);
        System.out.println("Recruiter:" + recruiter.getName());
        System.out.println("City"+ recruiter.getLocation().getCity());
        System.out.println("Fee:" + fee);
        System.out.println("Category:" + category);
    }

    

}
