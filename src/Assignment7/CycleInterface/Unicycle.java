package Assignment7.CycleInterface;

public class Unicycle implements Cycle{
    @Override
    public String noOfWheels() {
        return "1";
    }

    @Override
    public String balanceLevel() {
        return "Difficult to balance";
    }
}
