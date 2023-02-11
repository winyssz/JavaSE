package cn.click.thread;

import java.util.Date;

public class TestSleep {
    public static void main(String[] args) {
        MyThread m=new MyThread();
        m.start();
        try {
            Thread.sleep(10000);//哪个线程调用这个方法，哪个线程就阻塞，所以这里是主线程阻塞
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        m.interrupt();//主线程里面的，也就是m线程被打断，调用m的catch
    }
}

class MyThread extends Thread{

    @Override
    public void run() {
        while (true)
        {
            System.out.println("==="+new Date()+"===");
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                return;
            }
        }
    }
}
