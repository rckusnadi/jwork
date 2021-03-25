public class DatabaseRecruiter
{
    /*
     *
     *
     *
     * @author Ricky
     * @version 20-03-2021
     */
    /*
     *
     Deklarasi Variable
     */
    private String[] listRecruiter;

    /*
     *
     * Constructor untuk objek pada DatabaseRecruiter
     */
    public DatabaseRecruiter()
    {
    }

    /*
     *
     * membuat method addrecruiter dari databaserecruiter
     * @return true
     */
    public boolean addrecruiter(Recruiter recruiter){
        return true;
    }

    /*
     *
     * membuat method removerecruiter dari databaserecruiter
     * @return false
     */
    public boolean removerecruiter(Recruiter recruiter){
        return false;
    }

    /*
     *
     * getter recruiter dari databaserecruiter
     * @return recruiter
     */
    public Recruiter getRecruiter(){
        return recruiter;
    }

    /*
     *
     * getter getlisrecruiter dari databaserecruiter
     * @return listrecruiter
     */
    public String[] getListRecruiter(){
        return listRecruiter;
    }
}
