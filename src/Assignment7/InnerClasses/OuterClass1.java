package Assignment7.InnerClasses;

import java.util.logging.Logger;

public class OuterClass1 {
    Logger logger= Logger.getLogger(OuterClass1.class.getName());
    public OuterClass1(){
        logger.info("Outer class 1 constructor");
    }
    public class InnerClass1
    {
        public InnerClass1(String msg){
            logger.info(msg);
            logger.info("Inner class 1 constructor");
        }
    }
}
