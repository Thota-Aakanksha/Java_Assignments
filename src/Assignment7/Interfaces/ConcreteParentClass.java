package Assignment7.Interfaces;

import java.util.logging.Logger;

public class ConcreteParentClass {
    Logger logger= Logger.getLogger(ConcreteParentClass.class.getName());
    public void concreteMethod(){
        logger.info("Concrete class method");
    }
}
