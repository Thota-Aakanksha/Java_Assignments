package Assignment8;

import java.util.Scanner;
import java.util.logging.Logger;

public class Assignment8 {
    public static Logger logger= Logger.getLogger(Assignment8.class.getName());
    public static void main(String[] args) {
        DrivingLicense license=new DrivingLicense();

        Scanner scanner=new Scanner(System.in);
        logger.info("Enter age");
        int age=scanner.nextInt();
        logger.info("Enter the no of days since learner license applied");
        String learnersLicenseDuration=scanner.next();

        try {
            license.checkApplicantEligibility(age,learnersLicenseDuration);
        }
        catch (Exception e) {
            logger.info(e.toString());
        }
        finally {
            logger.info("Finally block executes");
        }

    }
}
