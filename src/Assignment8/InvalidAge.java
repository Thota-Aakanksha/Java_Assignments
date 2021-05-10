package Assignment8;
public class InvalidAge extends  Exception {
    int age;
    InvalidAge(int age){
        this.age=age;
    }
    @Override
    public String toString() {
        return age+" is not a valid age";
    }
}
