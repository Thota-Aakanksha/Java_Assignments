package Assignment7.Rodent;

import java.util.logging.Logger;

abstract public class Rodent {
    public Logger log = Logger.getLogger(Rodent.class.getName());
    abstract public void describeEars();
}
class Mouse extends Rodent {
    public Mouse() {
        log.info("Mouse default constructor");
    }
    @Override
    public void describeEars() {
        log.info("Mouse has massive ears");
    }
}
class Hamster extends Rodent {
    public Hamster() {
        log.info("Hamster default constructor");
    }
    @Override
    public void describeEars()
    {
        log.info("Hamster has large ears");
    }
}

class Gerbil extends Rodent{
    public Gerbil(){
        log.info("Gerbil default constructor");
    }
    @Override
    public void describeEars() {
        log.info("Gerbil has short ears");
    }
}


