public class Demo05 {
    public static void main(String[] args) {

        int[] num = new int[]{49831,81,8511,48,13,7,15,534,6,-5,-749,-85,6};
//        冒泡排序

        for (int i = 0; i < num.length ; i++) {

            for (int j = 0; j < num.length - 1 - i ; j++) {

                if(num[j] > num[j+1] ){
                    int temp = num[j];
                    num[j] = num[j+1];
                    num[j+1] = temp;

                }

            }
     }

        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + "\t");
        }
    }
}
