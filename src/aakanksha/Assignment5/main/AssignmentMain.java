package aakanksha.Assignment5.main;
import aakanksha.Assignment5.data.AssignmentData;
import aakanksha.Assignment5.singleton.AssignmentSingleton;

public class AssignmentMain {
    public static void main(String[] args) {

        AssignmentData data=new AssignmentData();
        data.localMethod();
        data.getInstances();

        AssignmentSingleton singleton=AssignmentSingleton.staticMethod("Hello");
        singleton.nonStaticMethod();
    }
}
