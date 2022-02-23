package SecondImplementation;

public class DarkRoast extends SIBeverage {
    public DarkRoast() {
        description = "This is our dark roast";
    }

    public double cost() {
        return 10.00 + super.cost();
    }
}
