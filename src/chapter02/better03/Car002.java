package chapter02.better03;

public final class Car002 extends BaseCar implements Runable {

    @Override
    public void run() {
        System.out.println("我行驶的速度是2米每秒");
    }

}
