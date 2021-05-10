package Assignment8;

public class AgeNotEligible extends Exception {
    int age;
    AgeNotEligible(int age){
        this.age=age;
    }
    @Override
    public String toString() {
        return age+" is not eligible for driving license. Age should be greater than 18";
    }
}