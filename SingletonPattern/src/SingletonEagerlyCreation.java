public class SingletonEagerlyCreation {
    /**
     * Solution #2 to Multithreading
     *
     * If you know that your application will always create and use an instance of your Singleton class OR
     * the overhead of creation and runtime aspects of the Singleton isn't a great deal of effort or trouble
     * then it is great to create your Singleton eagerly such that the JVM creates the instance when the
     * class is loaded. The JVM then can guarantee that the instance will exist before any thread can access it.
     *
     * TLDR - We will always instantiate the instance i.e. statically initializing and is another way to solve
     * multithreading however is not recommended if the overhead of creation of the Singleton instance isn't a
     * great deal of effort or trouble and you KNOW that your application will always want to create and use the
     * instance.
     */

    private static SingletonEagerlyCreation uniqueInstance = new SingletonEagerlyCreation();

    private SingletonEagerlyCreation() {}

    public static SingletonEagerlyCreation getInstance() {
        return uniqueInstance;
    }
}
