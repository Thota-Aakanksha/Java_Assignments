package Assignment11;

import java.io.*;
import java.util.HashMap;
import java.util.logging.Logger;

public class FileIO {
    public static Logger logger=Logger.getLogger(FileIO.class.getName());
    public void countCharacters(String inputFile,String outputFile) throws IOException {

        HashMap<Character,Integer> count=new HashMap<>();
        FileReader fin = new FileReader(inputFile);
        BufferedReader br=new BufferedReader(fin);
        String line;
        while((line=br.readLine())!=null)
        {
            for(char ch:line.toCharArray()){
                if(!count.containsKey(ch))
                    count.put(ch,1);
                else
                    count.put(ch,count.get(ch)+1);
            }
        }

        FileWriter fout=new FileWriter(outputFile);
        PrintWriter out=new PrintWriter(fout,true);
        for(Character ch:count.keySet())
            out.println(ch+": "+count.get(ch));
        logger.info("Output written");
    }

    public static void main(String[] args) throws IOException {
        if(args.length==0){
            logger.info("Enter input and output files as arguments");
        }
        else {
            FileIO counter = new FileIO();
            counter.countCharacters(args[0],args[1]);
        }

    }
}
