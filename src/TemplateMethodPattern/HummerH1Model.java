package TemplateMethodPattern;

public class HummerH1Model extends HummerModel {
    @Override
    protected void start() {
        System.out.println("h1开始了...");
    }

    @Override
    protected void stop() {
        System.out.println("h1结束了...");
    }
}
