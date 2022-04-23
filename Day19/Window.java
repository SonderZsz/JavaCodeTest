package Day19;
/**方式一：继承Threa类
 * 1. 创建一个继承与Thread类的子类
 * 2. 重写Thread类的run方法
 * 3. 创建Thread类的子类对象
 * 4. 通过此对象调用start方法
 *
 */
public class Window extends Thread{

    private static int ticket = 100;
    // static
    private static Object obj = new Object();

    @Override
    public void run() {
        while (true){
            synchronized(obj){
                if(ticket > 0){
                    try {
                        Thread.sleep(200);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread()+":买票，票号为："+ticket);
                    ticket--;
                }else {
                    break;
                }
            }
        }
    }
}

class WindowTest{
    public static void main(String[] args) {
        Window A = new Window();
        Window B = new Window();
        Window C = new Window();

        A.start();
        B.start();
        C.start();
    }
}