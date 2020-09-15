package SingletonPattern.Definition;

public class SingletonThread {
    public static SingletonThread singletonNoThreadSafe= null;

    public SingletonThread(){

    }

    /**
     * 这种做法会导致线程不安全
     * @return
     */
    public static SingletonThread getSingleton(){
        if(singletonNoThreadSafe == null){
            singletonNoThreadSafe = new SingletonThread();
        }
        return singletonNoThreadSafe;
    }

    /**
     * 线程安全
     * @return
     */
    public static synchronized SingletonThread getSingletonNoThreadSafe(){
        if(singletonNoThreadSafe == null){
            singletonNoThreadSafe = new SingletonThread();
        }
        return singletonNoThreadSafe;
    }
}
