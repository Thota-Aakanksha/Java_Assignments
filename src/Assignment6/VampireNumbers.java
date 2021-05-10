package Assignment6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class VampireNumbers
{
    public static void main(String[] args)
    {
        HashSet<Long> vampires=new HashSet<>();
        int limit=100;

        char[] fangs, vampireCandidate;
        long product;
        long x=10;

        while(vampires.size()<limit) {
            for(long y=x; y<1000; y++) {

                product=x*y;

                vampireCandidate= Long.toString(product).toCharArray();
                fangs = (Long.toString(x) + Long.toString(y)).toCharArray();

                Arrays.sort(vampireCandidate);
                Arrays.sort(fangs);

                if(Arrays.equals(vampireCandidate, fangs) ) {
                    vampires.add(product);
                }
            }
            x++;
        }
        ArrayList<Long> vampireArray= new ArrayList<>(vampires);
        Collections.sort(vampireArray);
        for(long i: vampireArray)
            System.out.println(i);

    }
}
