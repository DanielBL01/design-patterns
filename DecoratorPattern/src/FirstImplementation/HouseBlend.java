package FirstImplementation;

public class HouseBlend extends FIBeverage {
    public HouseBlend() {
        description = "This is our house blend special";
    }

    @Override
    public double cost() {
        return 5.00;
    }
}
