package Circle1;

import java.util.Scanner;
import java.util.Vector;

public class ScoreTest {
    public static void main(String[] args) {
        // 实例化Scanner，用于从键盘获取学生成绩
        Scanner scan = new Scanner(System.in);

        // 创建Vector对象：Vector v = new Vector（）；相当于原来的数组
        Vector v = new Vector();

        int maxScore = 0;
        // 通过for（；；），给Vector添加数组
        for (;;){
            System.out.println("请输入学生成绩（输入负数退出）：");
            int score = scan.nextInt();

            // 输入负数跳出循环
            if(score < 0){
                break;
            }
            if(score > 100){
                System.out.println("输入数据不合法!");
                continue;
            }

            // 添加操作
//            Integer inScore = new Integer(score);
//            v.addElement(inScore);
            v.addElement(score);

            // 获取最大值
            if(maxScore < score){
                maxScore = score;
            }
        }

        // 遍历Vector得到徐文胜成绩，并与最大值进行比较
        char level;
        for (int i = 0; i < v.size(); i++) {
            Object obj = v.elementAt(i);
            Integer inScore = (Integer)obj;
            int score = inScore.intValue();

            if(maxScore - score < 10){
                level = 'A';
            }else if(maxScore - score <= 20){
                level = 'B';
            }else if(maxScore - score <= 30){
                level = 'C';
            }else{
                level = 'D';
            }

            System.out.println("Student " + i + " score is " + score + " grade is "+ level + "!");
        }
    }
}
