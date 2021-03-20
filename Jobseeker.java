public class Jobseeker
{
    /*
     *
     * @author : Ricky
     * @version : 18/03/2021
     */
    private int id;
    private String name;
    private String email;
    private String password;
    private String joinDate;
    /*
     *
     * Constructor for objects of class Jobseeker
     * @param id merupakan id dari Jobseeker
     * @param name merupakan name dari Jobseeker
     * @param email merupakan email dari akun Jobseeker
     * @param password merupakan password akun Jobseeker
     * @param joindate adalah tanggal daftar jobSeeker
     *
     */


     public Jobseeker(int id, String name, String email, String password, String joinDate) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.joinDate = joinDate;
    }

    public int getId() { return id; }
    
    public String getName() { return name; }
    
    public String getEmail() { return email; }
    
    public String getPassword() { return password; }
    
    public String getJoinDate() { return joinDate; }

    /*
     *
     * Getter id
     * @return id dari data terkait
     * Getter name
     * @return name dari data terkait
     * Getter email
     * @return email dari data terkait
     * Getter password
     * @return paswword dari data terkait
     * Getter joindate
     * @return joindate dari data terkait
     */
    
    public void setId(int id) { this.id=id; }
    
    public void setName(String name) { this.name=name; }
    
    public void setEmail(String email) { this.email=email; }
    
    public void setPassword(String password) { this.password=password; }
    
    public void setJoinDate(String joinDate) { this.joinDate=joinDate; }

    /*
     *
     * Setter id
     * @return nilai baru id dari data terkait
     * Setter name
     * @return nilai baru name dari data terkait
     * Setter email
     * @return nilai baru email dari data terkait
     * Setter password
     * @return nilai baru password dari data terkait
     * Setter joindate
     * @return nilai baru joindate dari data terkait
     */

    public void printData() {System.out.println("Jobseeker:" + name);}

    

}

