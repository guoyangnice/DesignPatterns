package TemplateMethodPattern;

public abstract class HummerModel {
    public abstract void start();
    public abstract void stop();

    public void run(){
        this.start();;
        this.stop();
    }
}
