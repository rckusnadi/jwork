import java.util.Calendar;
import java.util.regex.*;
import java.util.GregorianCalendar;
import java.text.*;

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
    public Calendar joinDate;
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


    public Jobseeker(int id, String name, String email, String password, Calendar joinDate) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.joinDate = joinDate;
    }
    public Jobseeker(int id, String name, String email, String password,int year, int month, int dayOfMonth) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.joinDate = new GregorianCalendar(year, month, dayOfMonth);
    }
    public Jobseeker(int id, String name, String email, String password) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public int getId() {

         return id;
     }
    
    public String getName() {

         return name;
     }
    
    public String getEmail() {

         return email;
     }
    
    public String getPassword() {

         return password;
     }
    
    public Calendar getJoinDate() {

         return joinDate;
     }

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
    
    public void setId(int id) {

        this.id=id;
    }
    
    public void setName(String name) {

        this.name=name;
    }
    
    public void setEmail(String email){
        String regex = "^(?!.*([.])\1)[^.][a-zA-Z0-9.&*_~]+@[^-. ][a-zA-Z0-9-.&*_~]+(?:\\.[a-zA-Z0-9-]+)*";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        if(matcher.matches()){
            this.email = email;
        }
        else{
            this.email = "";
        }
    }

    
    public void setPassword(String password) {

        String regex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)[a-zA-Z\\d]{6,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);
        if(matcher.matches()){
            this.password = password;
        }
        else{
            this.password = "";
        }
    }
    
    public void setJoinDate(Calendar joinDate) {

        this.joinDate=joinDate;
    }
    public void setJoinDate(int year, int month, int dayOfMonth){
    
        this.joinDate=new GregorianCalendar(year, month, dayOfMonth);
    }

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

    public String toString() {
        if (this.joinDate == null) {
            return "Id = " + getId() + "\nNama = " + getName() + "\nEmail = " + getEmail() + "\nPassword = "
                    + getPassword();
        } else {
            SimpleDateFormat formattedDate = new SimpleDateFormat("dd-MMMM-yyyy");
            String date = formattedDate.format(getJoinDate().getTime());
            return "Id = " + getId() + "\nNama = " + getName() + "\nEmail = " + getEmail() + "\nPassword = "
                    + getPassword() + "\nJoin Date = " + date;
        }

    }
    }

    



