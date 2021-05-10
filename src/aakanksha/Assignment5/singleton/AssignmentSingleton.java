package aakanksha.Assignment5.singleton;

public class AssignmentSingleton {
    public String nonStaticVar;
    public static AssignmentSingleton staticMethod(String input)
    {
        /*
        'this' cannot be accessed from static methods so non static members can't be used here.
        nonStaticVar=input;
         */
        return new AssignmentSingleton();
    }
    public void nonStaticMethod() {
        //initialized to default value i.e null
        System.out.println(nonStaticVar);
    }


}
