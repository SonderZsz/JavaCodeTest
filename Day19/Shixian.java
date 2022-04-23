package Day19;

/**方式二：通过实现Runnable
 *
 */
public class Shixian implements Runnable{// 创建一个实现了Runnable接口的类
    private static int ticket = 100;
    private Object obj = new Object();

    // 实现类去实现Runnable中的abstract方法：run（）
    @Override
    public void run() {
        while (true){
            synchronized(this){
                if(ticket > 0){
                    try {
                        Thread.sleep(20);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName()+":买票，票号为："+ticket);
                    ticket--;
                }else {
                    break;
                }
            }
        }
    }
}
class text{

    public static void main(String[] args) {
        // 创建实现类的对象
        Shixian A  = new Shixian();
        // 将此对象作为参数传递到Thread类的构造器中，创建Thread类的对象
        Thread t1 = new Thread(A);
        Thread t2 = new Thread(A);
        Thread t3 = new Thread(A);
        // 通过Thread类的对象调用start（）
        t1.start();
        t2.start();
        t3.start();

        t1.setName("窗口1");
        t2.setName("窗口2");
        t3.setName("窗口3");

    }


}