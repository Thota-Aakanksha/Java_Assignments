package Assignment7.InnerClasses;

import java.util.logging.Logger;

public class OuterClass2 extends OuterClass1{
    Logger logger= Logger.getLogger(OuterClass2.class.getName());
    public OuterClass2(){
        logger.info("Outer class 2 constructor");
    }

    public class InnerClass2 extends OuterClass1.InnerClass1 {
        public InnerClass2(String message){
            super(message);
            logger.info("Inner class 2 constructor");
        }
    }
}
