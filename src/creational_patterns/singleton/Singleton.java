package creational_patterns.singleton;


public final class Singleton {

    private static Singleton instance;

    private Singleton() {
    }

    //synchronized is optional (for thread safety)
    public static synchronized Singleton getSingleton() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
