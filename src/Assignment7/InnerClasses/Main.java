package Assignment7.InnerClasses;

public class Main {
    public static void main(String[] args) {
        OuterClass2 outer2=new OuterClass2();
        OuterClass2.InnerClass2 inner2=outer2.new InnerClass2("Hello");
    }
}
