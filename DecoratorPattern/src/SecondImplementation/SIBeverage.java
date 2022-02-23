package SecondImplementation;

public abstract class SIBeverage {
    public String description;
    public boolean milk = false;
    public boolean soy = false;
    public boolean mocha = false;
    public boolean whip = false;

    public double milkCost = 1.0;
    public double soyCost = 1.5;
    public double mochaCost = 2.0;
    public double whipCost = 2.5;

    public String getDescription() {
        return description;
    }

    public double cost() {
        double condimentCost = 0.0;
        if (hasMilk()) {
            condimentCost += milkCost;
        }

        if (hasSoy()) {
            condimentCost += soyCost;
        }

        if (hasMocha()) {
            condimentCost += mochaCost;
        }

        if (hasWhip()) {
            condimentCost += whipCost;
        }

        return condimentCost;
    }

    public boolean hasMilk() { return milk; }
    public boolean hasSoy() { return soy; }
    public boolean hasMocha() { return mocha; }
    public boolean hasWhip() { return whip; }

    public void setMilk() { milk = true; }
    public void setSoy() { soy = true; }
    public void setMocha() { mocha = true; }
    public void setWhip() { whip = true; }
}
