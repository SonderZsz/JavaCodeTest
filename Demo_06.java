import java.util.Scanner;

public class Demo_06{
    public static void main(String[] args) {
//      读取学生个数
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入学生个数：");
        int theNum = scan.nextInt();
//      创建数组，存储学生成绩
        int[] scores = new int[theNum];
        System.out.println("请输入学生个数对应个数个成绩：");
//      给数组赋值
        for (int i = 0; i < scores.length ; i++) {
            scores[i] = scan.nextInt();
        }
//      判断最大值
        int MaxScore = 0;
        for (int i = 0; i < scores.length; i++) {
            if(MaxScore < scores[i]){
                MaxScore = scores[i];
            }
        }
        System.out.println("MaxScore is "+MaxScore);
        char Level;
        for (int i = 0; i < scores.length; i++) {
            if (MaxScore - scores[i] <= 10) {
                Level = 'A';
            } else if (MaxScore - scores[i] <= 20) {
                Level = 'B';
            } else if (MaxScore - scores[i] <= 30) {
                Level = 'C';
            }else{
                Level = 'D';
            }
            System.out.println("Student "+ i + " score is "
                    +scores[i] + ",grade is "+Level);
        }

    }
}
