public class SingletonHandleMultiThreading {
    /**
     * Solution #1 to Multithreading
     *
     * Imagine we have two threads each executing this code. Each thread will unfortunately create a unique object
     * creating object1 and object2 respectively. The synchronized keyword handles this multithreading issue. This
     * forces every thread to wait its turn before it can enter the method. That way, no two threads may enter
     * the method at the same time
     *
     * Keep in note however that this issue is only relevant on the first run. As soon as we actually create that
     * object, the synchronized keyword is just unneeded overhead!
     *
     * TLDR - This is the most straightforward technique that is guaranteed to work. However, using the synchronized
     * keyword for every getInstance() call is expensive.
     */

    private static SingletonHandleMultiThreading uniqueInstance;

    // Other useful instance variables

    private SingletonHandleMultiThreading() {}

    public static synchronized SingletonHandleMultiThreading getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new SingletonHandleMultiThreading();
        }
        return uniqueInstance;
    }

    // Other useful methods
}
