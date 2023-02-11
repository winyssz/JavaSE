package cn.click.thread;

public class TestThread {
    public static void main(String[] args) {
        Runnable1 r=new Runnable1();
        Thread t=new Thread(r);
        t.start();
        for (int i=1;i<=50;i++)
        {
            System.out.println("main->"+i);
        }
    }
}

class Runnable1 implements  Runnable{

    @Override
    public void run() {
        for (int i=1;i<=50;i++)
        {
            System.out.println("Runnable1->"+i);
        }
    }
}