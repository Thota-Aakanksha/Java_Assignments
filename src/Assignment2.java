import java.util.HashSet;
import java.util.Scanner;
import java.util.logging.Logger;

public class Assignment2 {
    public static Logger logger=Logger.getLogger(Assignment2.class.getName());

    public static String containsEntireAlphabet(String input) {
        HashSet<Character> uniqueletters = new HashSet<>();
        input = input.toLowerCase();

        for (char ch : input.toCharArray()) {
            if (Character.isAlphabetic(ch))
                uniqueletters.add(ch);
            if(uniqueletters.size()==26)
                return "true";
        }
        return "false";
    }

    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
        logger.info("Enter the input string");
        String input=in.nextLine();
        logger.info(containsEntireAlphabet(input));

        //test
        //logger.info(containsEntireAlphabet("The quick brown fox Jumps over the lazy dog .*8 !!"));
    }
}
