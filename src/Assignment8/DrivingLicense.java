package Assignment8;
import java.util.logging.Logger;

public class DrivingLicense {
    public Logger logger= Logger.getLogger(DrivingLicense.class.getName());

    public void checkApplicantEligibility(int age,String learnerLicenseDuration) throws InvalidAge,AgeNotEligible,InvalidLearnerLicense{
        if(age<0)
            throw new InvalidAge(age);
        else if(age<18)
            throw new AgeNotEligible(age);
        else if(Integer.parseInt(learnerLicenseDuration)==0)
            throw new NullPointerException("Apply for learner's license first");
        else if(Integer.parseInt(learnerLicenseDuration)<30)
            throw new InvalidLearnerLicense();
        else
            logger.info("Eligible for driving license");
    }
}