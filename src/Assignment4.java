import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.logging.Logger;

public class Assignment4 {

    private static final Scanner scanner=new Scanner(System.in);
    private static final DateTimeFormatter formatType=DateTimeFormatter.ofPattern("dd-MM-yyyy");
    private static final Logger logger=Logger.getLogger(Assignment4.class.getName());

    public static void kyc(String signup, String present)
    {
        LocalDate anniversaryDate = LocalDate.parse(signup.substring(0, 6) + present.substring(6), formatType);
        LocalDate signUpDate = LocalDate.parse(signup, formatType);
        LocalDate presentDate = LocalDate.parse(present, formatType);

        LocalDate upperBound= anniversaryDate.plusDays(30);
        LocalDate lowerBound= anniversaryDate.minusDays(30);

        String result;

        if(presentDate.compareTo(signUpDate.minusDays(30))<=0)
            result = "No range";

        else if(presentDate.compareTo(upperBound)>0)
            result = lowerBound.format(formatType) + " " + upperBound.format(formatType);

        else if(presentDate.compareTo(upperBound)<=0 && presentDate.compareTo(lowerBound)>0)
            result = lowerBound.format(formatType) + " " + presentDate.format(formatType);

        //present date can be accounted to previous year when presentDate < lowerbound
        else {
            anniversaryDate = anniversaryDate.minusYears(1);
            lowerBound= anniversaryDate.minusDays(30);
            upperBound= anniversaryDate.plusDays(30);
            result = lowerBound.format(formatType) + " " + upperBound.format(formatType);
        }

        logger.info(result);
    }
    public static void main(String[] args) {
        int testCases=scanner.nextInt();
        for(int i=0;i<testCases;i++) {
            String signup=scanner.next();
            String present=scanner.next();
            kyc(signup,present);
        }
    }
}
