import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.logging.Logger;

public class Assignment3 {
    public static Logger logger=Logger.getLogger(Assignment3.class.getName());
    private ArrayList<Double> pingTimes=new ArrayList<>();

    public static void main(String[] args) {
        Assignment3 pingObject=new Assignment3();
        Scanner sc=new Scanner(System.in);

        logger.info("Enter no of pings");
        int noOfpings=sc.nextInt();
        sc.nextLine(); //read extra new line
        logger.info("Enter the host");
        String host=sc.nextLine();

        logger.info("Median ping time is: "+ pingObject.ping(noOfpings,host));
    }

    public double ping(int noOfPings, String host)
    {
        try{
            Process process = Runtime.getRuntime().exec("ping -c"+noOfPings+" "+host);
            BufferedReader bf = new BufferedReader(new InputStreamReader(process.getInputStream()));

            String pingOutputLine;
            double curPingTime;

            while((pingOutputLine = bf.readLine()) !=null){
                logger.info(pingOutputLine);
                curPingTime=extractTime(pingOutputLine);
                if(curPingTime!=-1)
                    pingTimes.add(curPingTime);
            }
            bf.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        return findMedianTime();
    }
    public double extractTime(String line)
    {
        int timeIndex=line.indexOf("time=");
        double time=-1.0;
        if(timeIndex!=-1)
            time=Double.parseDouble(line.substring(timeIndex+5,timeIndex+10));
        return time;
    }

    public double findMedianTime()
    {
        double median;
        int noOfPings=pingTimes.size();
        Collections.sort(pingTimes);

        if(noOfPings%2!=0)
            median=pingTimes.get(noOfPings/2);
        else
            median=(pingTimes.get(noOfPings/2)+pingTimes.get((noOfPings/2)-1))/(double)2;

        return median;
    }

}
