package SingletonPattern.Definition;

/**
 * 单例的一般用法
 */
public class Singleton {
    private static final Singleton singleton = new Singleton();

    public Singleton(){

    }

    public static Singleton getSingleton() {
        return singleton;
    }

    public static void doSomething(){

    }
}
