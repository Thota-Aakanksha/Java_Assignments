package Assignment7.Interfaces;

import java.util.logging.Logger;

public class Main extends ConcreteParentClass implements CombinedInterface{
    static Logger logger= Logger.getLogger(Main.class.getName());

    @Override
    public void interface1Method1() {
        logger.info("Interface 1 method 1");
    }

    @Override
    public void interface1Method2() {
        logger.info("Interface 1 method 2");
    }

    @Override
    public void interface2Method1() {
        logger.info("Interface 2 method 1");
    }

    @Override
    public void interface2Method2() {
        logger.info("Interface 2 method 2");
    }

    @Override
    public void interface3Method1() {
        logger.info("Interface 3 method 1");
    }

    @Override
    public void interface3Method2() {
        logger.info("Interface 3 method 2");
    }

    @Override
    public void combinedIntefaceMethod() {
        logger.info("Combined Interface method ");
    }


    public void methodInterface1(Interface1 reference){
        reference.interface1Method1();
        reference.interface1Method2();
    }
    public void methodInterface2(Interface2 reference){
        reference.interface2Method1();
        reference.interface2Method2();
    }
    public void methodInterface3(Interface3 reference){
        reference.interface3Method1();
        reference.interface3Method2();
    }
    public void methodCombinedInterface(CombinedInterface reference){
        reference.combinedIntefaceMethod();
    }

    public static void main(String[] args) {
        Main object=new Main();
        object.methodInterface1(object);
        object.methodInterface2(object);
        object.methodInterface3(object);
        object.methodCombinedInterface(object);
    }

}
