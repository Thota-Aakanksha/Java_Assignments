package Assignment7.CycleInterface;

import java.util.logging.Logger;

public class Main {
    static Logger logger= Logger.getLogger(Main.class.getName());
    public static void main(String[] args) {
        CycleFactory factory=new CycleFactory();
        Cycle cycle;

        cycle=factory.getCycle("Unicycle");
        logger.info(cycle.noOfWheels());
        logger.info(cycle.balanceLevel());

        cycle=factory.getCycle("Bicycle");
        logger.info(cycle.noOfWheels());
        logger.info(cycle.balanceLevel());


        cycle=factory.getCycle("Tricycle");
        logger.info(cycle.noOfWheels());
        logger.info(cycle.balanceLevel());

    }
}
