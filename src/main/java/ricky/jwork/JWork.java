package ricky.jwork;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

public class JWork {

    public static void main(String[] args) {
        Location location1 = new Location("Jawa Barat", "Bandung", "Cicaheum");
        Location location2 = new Location("Jawa Barat", "Bandung", "Pasteur");
        Location location3 = new Location("Jawa Barat", "Depok", "Margonda");
        DatabaseRecruiter.addRecruiter(new Recruiter(DatabaseRecruiter.getLastId() + 1, "Kusnadi", "kusnadi@ui.ac.id", "081233224422", location1));
        DatabaseRecruiter.addRecruiter(new Recruiter(DatabaseRecruiter.getLastId() + 1, "Ricky", "ricky82@ui.ac.id", "085755334412", location2));
        DatabaseRecruiter.addRecruiter(new Recruiter(DatabaseRecruiter.getLastId() + 1, "Mustofa", "mk@ui.ac.id", "083234155123", location3));
        try {
            DatabaseJob.addJob(new Job(1, "Backend Engineer 1", DatabaseRecruiter.getRecruiterById(1), 50000, jobCategory.BackEnd));
            DatabaseJob.addJob(new Job(2, "Backend Engineer 2", DatabaseRecruiter.getRecruiterById(2), 20000, jobCategory.BackEnd));
            DatabaseJob.addJob(new Job(3, "Frontend Engineer 1", DatabaseRecruiter.getRecruiterById(3), 10000, jobCategory.FrontEnd));
            DatabaseJob.addJob(new Job(4, "Data Analyst 1", DatabaseRecruiter.getRecruiterById(3), 30000, jobCategory.DataAnalyst));
            DatabaseBonus.addBonus(new Bonus(1, "SENANGSEKALI", 5000, 1000, true));
        } catch (RecruiterNotFoundException | ReferralCodeAlreadyExistsException e) {
            e.printStackTrace();
        }
        SpringApplication.run(JWork.class, args);
    }

}
        
        

