package ricky.jwork;
import java.util.ArrayList;
/**
 * Write a description of class DatabaseRecruiter here.
 *
 * @author Ricky
 * @version  22-04-2021
 */
public class DatabaseRecruiter
{
    // instance variables - replace the example below with your own
    private static ArrayList<Recruiter> RECRUITER_DATABASE = new ArrayList<Recruiter>();
    private static int lastId = 0;

    public static ArrayList<Recruiter> getRecruiterDatabase() {
        return RECRUITER_DATABASE;
    }

    public static int getLastId() {
        return lastId;
    }

    /**
     * method menambahkan recruiter
     *
     * @param recruiter
     * @return boolean
     */
    public static boolean addRecruiter(Recruiter recruiter) {
        RECRUITER_DATABASE.add(recruiter);
        lastId = recruiter.getId();
        return true;
    }

    /**
     * method menghapus recruiter
     *
     * @param id
     * @return boolean
     */
    public static boolean removeRecruiter(int id) throws RecruiterNotFoundException {
        boolean tempBool = true;
        for (Recruiter recruiter : RECRUITER_DATABASE) {
            if (id == recruiter.getId()) {
                RECRUITER_DATABASE.remove(id);
                tempBool = true;
                return tempBool;
            }
        }
        throw new RecruiterNotFoundException(id);
    }

    /**
     * method mendapatkan recuiter
     *
     * @return null
     */
    public static Recruiter getRecruiterById(int id) throws RecruiterNotFoundException {
        Recruiter temp = null;
        for (Recruiter recruiter: RECRUITER_DATABASE) {
            if (id == recruiter.getId()) {
                temp = recruiter;
                return temp;
            }
        }
        throw new RecruiterNotFoundException(id);
    }
}
