import java.util.Scanner;
import java.util.logging.Logger;
import java.util.regex.Pattern;

public class Assignment9 {
    public static void main(String[] args) {
        String regex="^[A-Z].*[.]$";

        Scanner scanner=new Scanner(System.in);
        Logger logger= Logger.getLogger(Assignment9.class.getName());
        logger.info("Enter the sentence");
        String input=scanner.nextLine();

        if(Pattern.matches(regex,input))
            logger.info("Given sentence start with capital letter and ends with .");
        else
            logger.info("Given sentence does not start with capital letter and ends with .");

    }
}
