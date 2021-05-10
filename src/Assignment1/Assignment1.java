package Assignment1;

import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Logger;
import java.util.regex.Pattern;

class Filter implements FilenameFilter {
    String pattern;
    Filter(String input){
        this.pattern=input;
    }

    @Override
    public boolean accept(File file, String s) {
        return Pattern.matches(pattern,s);
    }
}
public class Assignment1{
    static Logger logger=Logger.getLogger(Assignment1.class.getName());

    public static ArrayList<String> getFiles(File directory, String  pattern)
    {
        ArrayList<String> list=new ArrayList<>();
        for (File file : directory.listFiles(new Filter(pattern)))
                list.add(file.getName());
        return list;
    }

    public static void main(String[] args) {
        File homeDir=new File(System. getProperty("user.home"));

        String pattern;
        Scanner scanner=new Scanner(System.in);
        logger.info("Enter the pattern to match or 'quit' to exit");
        while(true) {
            pattern = scanner.next();
            if(pattern.equals("quit"))
                break;

            ArrayList<String> matchedFiles = getFiles(homeDir, pattern);

            if(matchedFiles.size()==0)
                logger.info("No files matched");
            else
                for (String s : matchedFiles)
                    logger.info(s);
        }
    }

}
