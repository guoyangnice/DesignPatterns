package TemplateMethodPattern;

public class HummerH1Model extends HummerModel {
    @Override
    public void start() {
        System.out.println("h1开始了...");
    }

    @Override
    public void stop() {
        System.out.println("h1结束了...");
    }
}
