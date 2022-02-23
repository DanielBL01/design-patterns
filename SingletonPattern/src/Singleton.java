public class Singleton {
    private static Singleton uniqueInstance;

    // Other useful instance variables

    // The use of a private constructor ensures that only Singleton can instantiate this class
    private Singleton() {}

    /* The use of getInstance is that it is a static class, therefore it does not belong to an instance. It is also
    / public and belongs to Singleton such that it can call the private constructor and return its instance. */
    public static Singleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }

    // Other useful methods
}
