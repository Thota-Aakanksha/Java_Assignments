package Assignment7.CycleClass;

import Assignment7.CycleClass.Bicycle;
import Assignment7.CycleClass.Cycle;
import Assignment7.CycleClass.Tricycle;
import Assignment7.CycleClass.Unicycle;

public class MainCycle {
    public static void main(String[] args) {
        Unicycle unicycle=new Unicycle();
        Bicycle bicycle=new Bicycle();
        Tricycle tricycle=new Tricycle();

        //Upcasting -- occurs implicitly
        Cycle[] cycles=new Cycle[3];
        cycles[0] = unicycle;
        cycles[1] = bicycle ;
        cycles[2] = tricycle;

        /* Cycle class does not have balance method
        for(int i=0;i<3;i++)
            cycles[i].balance();
         */

        //Downcasting -- explicit casting needed
        Unicycle unicycle1 = (Unicycle) cycles[0];
        Bicycle bicycle1 = (Bicycle) cycles[1];
        Tricycle tricycle1 = (Tricycle) cycles[2];

        unicycle1.balance();
        bicycle1.balance();
        //tricycle1.balance(); error since tricycle does not have balance method
    }
}
