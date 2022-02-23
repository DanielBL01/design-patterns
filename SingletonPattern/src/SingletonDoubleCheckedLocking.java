public class SingletonDoubleCheckedLocking {
    /**
     * Solution #3
     *
     * With Double-checked locking you can reduce the use of synchronization in getInstance() i.e. only
     * synchronize the first time through. We like this because it is expensive to synchronize the getInstance()
     * method.
     *
     * Remember that static variables like uniqueInstance belong to the class therefore it is shared amongst all the
     * class' instances and there is only copy in memory. Therefore, a volatile static variable will ensure that
     * multiple threads handle the uniqueInstance correctly when it is being initialized to the Singleton instance.
     *
     * Great in terms of dealing with performance concerns as it will use the synchronized keyword only when the
     * uniqueInstance has not been created.
     */

    private volatile static SingletonDoubleCheckedLocking uniqueInstance;

    private SingletonDoubleCheckedLocking() {}

    public static SingletonDoubleCheckedLocking getInstance() {
        if (uniqueInstance == null) {
            synchronized (SingletonDoubleCheckedLocking.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new SingletonDoubleCheckedLocking();
                }
            }
        }

        return uniqueInstance;
    }
}
