package Assignment6;

public class ConstructorDemo {
    private int limit;

    public ConstructorDemo() {
        //calls the other constructor of same class
        this(5);
    }

    public ConstructorDemo(int limit) {
        this.limit=limit;
    }

    public ConstructorDemo(String input){
        System.out.println(input);
    }

    public static void main(String[] args) {
        ConstructorDemo[] array=new ConstructorDemo[3];
        //initialization message is not printed when references are created.
        for(int i=0;i<5;i++)
            array[i]=new ConstructorDemo("Object created");
    }
}
