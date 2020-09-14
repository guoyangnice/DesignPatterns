package SingletonPattern.Definition;

public class Singleton {
    public static Singleton singletonNoThreadSafe= null;

    public Singleton(){

    }

    /**
     * 这种做法会导致线程不安全
     * @return
     */
    public static Singleton getSingleton(){
        if(singletonNoThreadSafe == null){
            singletonNoThreadSafe = new Singleton();
        }
        return singletonNoThreadSafe;
    }

    /**
     * 线程安全
     * @return
     */
    public static synchronized Singleton getSingletonNoThreadSafe(){
        if(singletonNoThreadSafe == null){
            singletonNoThreadSafe = new Singleton();
        }
        return singletonNoThreadSafe;
    }
}
