package TemplateMethodPattern;

public abstract class HummerModel {
    protected abstract void start();
    protected abstract void stop();

    public void run(){
        this.start();;
        this.stop();
    }
}
