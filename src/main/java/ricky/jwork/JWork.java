package ricky.jwork;

import java.util.Calendar;
import java.util.regex.*;
import java.util.GregorianCalendar;
import java.text.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@SpringBootApplication(exclude = {ErrorMvcAutoConfiguration.class})

public class JWork {

    public static void main(String[] args) {
        Location location1 = new Location("Jawa Barat", "Depok", "UI");
        Location location2 = new Location("Jawa Barat", "Bandung", "Rumah");
        Location location3 = new Location("Jawa Barat", "Garut", "Rumah");

        DatabaseRecruiter.addRecruiter(new Recruiter(DatabaseRecruiter.getLastId() + 1, "Ricky", "ricky82@ui.ac.id", "081224446429", location1));
        DatabaseRecruiter.addRecruiter(new Recruiter(DatabaseRecruiter.getLastId() + 2, "RickyK", "ricky@ui.ac.id", "081224446429", location2));
        DatabaseRecruiter.addRecruiter(new Recruiter(DatabaseRecruiter.getLastId() + 1, "Kusnadi", "kusnadi@ui.ac.id", "081224446429", location3));
        try {
            DatabaseJob.addJob(new Job(14, "Backend Engineer Solusimas", DatabaseRecruiter.getRecruiterById(1), 100000, jobCategory.BackEnd));
            DatabaseJob.addJob(new Job(15, "Frontend Engineer Solusimas", DatabaseRecruiter.getRecruiterById(2), 200000, jobCategory.FrontEnd));
            DatabaseJob.addJob(new Job(16, "UI Engineer Solusimas", DatabaseRecruiter.getRecruiterById(2), 150000, jobCategory.UI));
        }
        catch(RecruiterNotFoundException e){
            e.printStackTrace();
        }
        SpringApplication.run(JWork.class, args);
    }

}
        
        

