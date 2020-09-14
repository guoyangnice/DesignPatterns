package SingletonPattern.Emperor;

/**
 * 本例来自于设计模式之禅
 */
public class Emperor {
    private static final Emperor emperor = new Emperor();
    private Emperor(){
        //不想产生第二个皇帝
    }
    public static Emperor getInstance(){
        return emperor;
    }
    public static void say(){
        System.out.println("我就是皇帝XXX...");
    }
}
