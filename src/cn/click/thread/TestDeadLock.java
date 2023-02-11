package cn.click.thread;
public class TestDeadLock implements Runnable {
    int b = 100;  //成员变量，一个方法改变了值就是永远改变了

    public synchronized void m1() throws Exception {
        b = 1000;
        Thread.sleep(5000);
        System.out.println("b=" + b);
    }

    public void m2() {
        System.out.println(b);
    }

    @Override
    public void run() {
        try {
            m1();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        /**
         * 显示结果为：1000  b=1000
         * 原因：synchronized修饰的只是这个方法，而不是修饰这个类，所以当m1被加锁sleep时，此时b已经为1000，并且，调用其它线程
         * 虽然不会进入m1，但是会进入其它的方法，如m2，所以，先输出1000；然后等m1的睡眠时间结束之后，输出m1的语句
         */
        TestDeadLock t = new TestDeadLock();
        Thread t1 = new Thread(t);
//		Thread t2 = new Thread(t);
        t1.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //调用m2方法
        t.m2();
    }
}