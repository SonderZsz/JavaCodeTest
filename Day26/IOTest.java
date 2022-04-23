package Day26;

import org.junit.Test;

import java.io.*;

public class IOTest {
    // 将E:\Java\Part4\Day22\hello.txt文件内容读入程序中
    @Test
    public void testFileTest(){
        // 1.实例化File类的对象
        FileReader fr = null;
        try {
            File file =new File("hello.txt");
            System.out.println(file.getAbsoluteFile());
            // 2.提供具体的流
            fr = new FileReader(file);
            // 3.数据的读入
            // read（）：返回读入的应该字符，如果达到文件末尾，返回-1
            int read = fr.read();
            while (read != -1){
                System.out.print((char) read);
                    read = fr.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {// 为了保证流一定关闭
            // 4.流的关闭操作
            try {
                if(fr != null)
                    fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    // 对read（）操作升级，使用read的重载方法
    @Test
    public void fileReaderTest2() {
        // 1.File类的实例
        FileReader fileReader = null;
        try {
            File file = new File("hello.txt");
            // 2.FileReader流的实例化
            fileReader = new FileReader(file);
            // 3.读入的操作
            char[] arr = new char[5];
            int len;
            while((len = fileReader.read(arr)) != -1){
//                for (int i = 0; i < arr.length; i++) {
//                    System.out.print(arr[i]);
//                }
//                错误的写法
                for (int i = 0; i < len; i++) {
                    System.out.print(arr[i]);
                }

            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                // 4.资源的关闭
                fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    // 从内存写出数据到硬盘的文件里
    @Test
    public void FileWriterTest() throws IOException {
        // 1.提供File类的对象，指明写出的文件
        File file = new File("hello1.txt");
        // 2.提供FileWriter的对象，用于数据的写出
        FileWriter fw = new FileWriter(file);
        // 3.写出的操作
        fw.write("adwadw");

        // 4.流资源的关闭
        fw.close();
    }
    // 缓冲流的使用
    @Test
    public void BufferedTest1(){

    }


}
