package TemplateMethodPattern;

public class HummerH2Model extends HummerModel {
    @Override
    protected void start() {
        System.out.println("h2开始了...");
    }

    @Override
    protected void stop() {
        System.out.println("h2结束了...");
    }
}
