package FactoryPattern;

import java.lang.reflect.InvocationTargetException;

public abstract class AbstractHumanFactory {
    public abstract <T extends Human> T createHuman(Class<T> c) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException;
}
