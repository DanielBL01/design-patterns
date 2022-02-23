package SecondImplementation;

public class HouseBlend extends SIBeverage {
    public HouseBlend() {
        description = "This is our house blend special";
    }

    public double cost() {
        return 5.00 + super.cost();
    }
}
