package chapter03.better02;

public final class CarA002 extends BaseCarA implements Runable {

    @Override
    public void run() {
        System.out.println("我行驶的速度是2米每秒");
    }

}
