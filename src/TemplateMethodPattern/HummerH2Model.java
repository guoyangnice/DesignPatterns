package TemplateMethodPattern;

public class HummerH2Model extends HummerModel {
    @Override
    public void start() {
        System.out.println("h2开始了...");
    }

    @Override
    public void stop() {
        System.out.println("h2结束了...");
    }
}
