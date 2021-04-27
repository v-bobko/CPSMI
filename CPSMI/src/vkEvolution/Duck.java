package vkEvolution;

public class Duck extends Fish implements Runnable {
    @Override
    public void swim() {
        System.out.println(" Kry Kry I'm swimming");
    }

    @Override
    public void run() {
        System.out.println(" Duck can fly!" + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        Duck dd = new Duck();
        new Thread(dd).start();
        new Thread(dd).start();
        new Thread(dd).start();
    }
}
