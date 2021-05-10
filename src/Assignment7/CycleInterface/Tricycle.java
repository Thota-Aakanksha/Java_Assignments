package Assignment7.CycleInterface;

public class Tricycle implements Cycle {
    @Override
    public String noOfWheels() {
        return "3";
    }

    @Override
    public String balanceLevel() {
        return "Easy to balance";
    }
}