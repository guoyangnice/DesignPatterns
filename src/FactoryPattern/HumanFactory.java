package FactoryPattern;

import java.lang.reflect.InvocationTargetException;

public class HumanFactory extends AbstractHumanFactory {
    @Override
    public <T extends Human> T createHuman(Class<T> c) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        Human human = null;
        human = c.getDeclaredConstructor().newInstance();
        return (T)human;
    }
}
