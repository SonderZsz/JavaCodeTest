public class Demo02 {
    public static void main(String[] args) {

        int[] num = new int[10];
        for (int i = 0; i < num.length; i++) {
            num[i] = (int)(Math.random() * (99-10+1)+10);
        }

        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + "\t");
        }
        System.out.println();

//        Max
        int maxValue = num[0];
        for (int i = 0; i < num.length; i++) {
            if (maxValue < num[i]){
                maxValue = num[i];
            }
        }
        System.out.println("MaxValue is " + maxValue + '.');

//        Min
        int minValue = num[0];
        for (int i = 0; i < num.length; i++) {
            if (minValue > num[i]){
                minValue = num[i];
            }
        }
        System.out.println("MinValue is " + minValue + '.');

//        sum
        int sum = 0;
        for (int i = 0; i < num.length; i++) {
            sum += num[i];
        }
        System.out.println("Sum is " + sum + '.');

//        Average
        System.out.println("Average is " + sum/num.length + '.');
    }
}
