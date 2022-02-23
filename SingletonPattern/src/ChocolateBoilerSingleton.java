public class ChocolateBoilerSingleton {
    /**
     * Although we have added the Singleton Pattern to our codebase, we find out that the Chocolate Boiler's fill() method
     * was able to start filling the boiler even though a batch of milk and chocolate was already boiling. What could
     * have happened? Multithreading!
     *
     * The following three classes i.e. SingletonDoubleCheckedLocking, SingletonEagerlyCreation and
     * SingletonHandleMultiThreading are three different solutions to this problem.
     */
    private boolean empty;
    private boolean boiled;

    // The class now maintains a private static uniqueInstance
    private static ChocolateBoilerSingleton uniqueInstance;

    // The constructor is now a private constructor that can only be used internally within ChocolateBoilerSingleton
    private ChocolateBoilerSingleton() {
        empty = true;
        boiled = false;
    }

    // Finally, we add our public static method which will act as our global access point to our single object
    public static ChocolateBoilerSingleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new ChocolateBoilerSingleton();
        }

        return uniqueInstance;
    }

    public void fill() {
        if (isEmpty()) {
            empty = false;
            boiled = false;
            // Fill the boiler with a milk/chocolate mixture
        }
    }

    public void drain() {
        if (!isEmpty() && isEmpty()) {
            // drain the boiled milk and chocolate
            empty = true;
        }
    }

    public void boil() {
        if (!isEmpty() && !isBoiled()) {
            // bring the contents to a boil
            boiled = true;
        }
    }

    public boolean isEmpty() {
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }
}
