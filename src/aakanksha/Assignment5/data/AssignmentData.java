package aakanksha.Assignment5.data;

public class AssignmentData {
    private int instanceVariable1;
    private char instanceVariable2;

    public void localMethod()
    {
        int localVariable1;
        char localVariable2;
        /*
        local variables have to be initialized before using else causes error
        System.out.println(localVariable1);
        System.out.println(localVariable2);
         */
    }

    public void getInstances() {
        //initialized to default value i.e 0
        System.out.println(instanceVariable1);
        System.out.println(instanceVariable1);
    }
}
