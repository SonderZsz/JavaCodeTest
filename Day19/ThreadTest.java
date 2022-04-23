package Day19;

public class ThreadTest extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if(i % 2 == 0){
                System.out.println(Thread.currentThread() + ":" +i);
            }
        }
    }

    public static void main(String[] args) {
        ThreadTest A = new ThreadTest();
//        ThreadTest B = new ThreadTest();
        A.setName("thread");
        Thread.currentThread().setName("main");
        A.start();
//        B.start();// 多个线程
//      A.run();  没有启动线程
    }
}
