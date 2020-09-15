package FactoryPattern;

import java.lang.reflect.InvocationTargetException;

public class NvWa {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        AbstractHumanFactory YingYangLu = new HumanFactory();
        System.out.println("第一批白人");
        Human whiteHuman = YingYangLu.createHuman(WhiteHuman.class);
        whiteHuman.getColor();
        whiteHuman.talk();

        System.out.println("第一批黑人");
        Human blackHuman = YingYangLu.createHuman(BlackHuman.class);
        blackHuman.getColor();
        blackHuman.talk();

        System.out.println("第一批黄人");
        Human yellowHuman = YingYangLu.createHuman(YellowHuman.class);
        yellowHuman.getColor();
        yellowHuman.talk();
    }
}
