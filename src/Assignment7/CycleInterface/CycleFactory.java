package Assignment7.CycleInterface;

public class CycleFactory {
    public Cycle getCycle(String type) {
        if(type.equals("Unicycle"))
            return new Unicycle();
        else if(type.equals("Bicycle"))
            return new BiCycle();
        else
            return new Tricycle();
    }
}
