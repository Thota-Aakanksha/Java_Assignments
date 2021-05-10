package Assignment7.CycleClass;

import java.util.logging.Logger;

public class Cycle {
    public Logger logger=Logger.getLogger(Cycle.class.getName());
    public Cycle(){
        logger.info("Cycle default constructor");
    }
}
class Unicycle extends Cycle {
    public Unicycle(){
        logger.info("Unicycle default constructor");
    }
    public void balance() {
        logger.info("Unicycle can balance");
    }
}
class Bicycle extends Cycle {
    public Bicycle(){
        logger.info("Bicycle default constructor");
    }
    public void balance() {
        logger.info("Bicycle can balance");
    }
}
class Tricycle extends Cycle {
    public Tricycle(){
        logger.info("Tricycle default constructor");
    }
}
