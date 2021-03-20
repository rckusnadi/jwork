public class Recruiter
{

    /*
     *
     * @author : Ricky
     * @version : 18/03/2021
     */
    private int id;
    private String name;
    private String email;
    private String phoneNumber;
    private Location location;
    /*
     *
     * Constructor for objects of class Recruiter
     * @param id merupakan id dari Recruiter
     * @param name merupakan name dari Jobseeker
     * @param email merupakan email dari akun Recruiter
     * @param phonenumber merupakan notelp akun Recruiter
     * @param location adalah lokasi Recruiter
     *
     */

    public Recruiter (int id, String name, String email, String phoneNumber, Location location) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.location = location;

    }

    public int getId() { return id; }
    
    public String getName() { return name; }

    public Location getLocation(){ return location; }
        
    public String getEmail() { return email; }
    
    public String getPhoneNumber() { return phoneNumber; }

    /*
     *
     * Getter id
     * @return id dari data terkait
     * Getter name
     * @return name dari data terkait
     * Getter location
     * @return location dari data terkait
     * Getter email
     * @return email dari data terkait
     * Getter phonenumber
     * @return phonenumber dari data terkait
     */
    
    public void setId(int id) { this.id = id; }
    
    public void setEmail(String email) { this.email = email; }
    
    public void setName(String name) { this.name = name; }
    
    public void setPhoneNumber(String phoneNumber) { this.phoneNumber=phoneNumber; }

    public void setLocation(Location location) { this.location=location; }

    /*
     *
     * Setter id
     * @return nilai baru id dari data terkait
     * Setter name
     * @return nilai baru name dari data terkait
     * Setter email
     * @return nilai baru email dari data terkait
     * Setter phone number
     * @return nilai baru phonenumber dari data terkait
     * Setter location
     * @return nilai baru location dari data terkait
     */

    public void printData(){ System.out.println("Recruiter:" + name);}

     

}

