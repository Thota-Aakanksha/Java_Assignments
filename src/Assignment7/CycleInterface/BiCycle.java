package Assignment7.CycleInterface;

public class BiCycle implements Cycle{
    @Override
    public String noOfWheels() {
        return "2";
    }

    @Override
    public String balanceLevel() {
        return "Moderate balance";
    }
}
