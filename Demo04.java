import java.util.Arrays;

public class Demo04 {
    public static void main(String[] args) {
//        二分法：前提有序
        int[] num = new int[]{6,89,4,156,1,89,-949,-392,54,-598,-5928,-78,-4165,564};
        Arrays.sort(num);

        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + "\t");
        }
        System.out.println();
//      创建一个排序后的新数组
        int[] sortednum = new int[14];
        for (int i = 0; i < num.length; i++) {
            sortednum[i] = num[i];
            System.out.print(sortednum[i] +"\t");
        }
        System.out.println();

        int dest = 6;
        int head = 0;// 初始的首索引
        int end = num.length - 1;// 初始的末索引

        boolean isFlag = true;

        while (head <= end){
            int middle = (head + end)/2;

            if (dest == num[middle]){
                System.out.println("Destination has been found" +
                        ",and it's index is " + middle + ".");
                isFlag = false;
                break;
            }else if(dest <num[middle]){
                end = middle - 1;
            } else if (dest > num[middle]) {
                head = middle + 1;
            }
        }
//       判断是否进入循环
        if(isFlag){
            System.out.println("Destination has not been found!");
        }
    }
}
