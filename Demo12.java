import java.util.Arrays;
public class Demo12  {
    public static void main(String[] args) {
        int[] arr = new int[]{12,3,3,34,56,77,432};
        for (int i = arr.length-1;i>=0; i--) {
            arr[i] = arr[i] /arr[0];
        }
        System.out.println(Arrays.toString(arr));
        System.out.println();
        int temp = arr[0];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] / temp;
        }
        System.out.println(Arrays.toString(arr));
    }

}
