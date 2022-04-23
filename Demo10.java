public class Demo10 {
    public static void main(String[] args) {
//        for (int i = 0; i < 20; i++) {
//            Student i = new Student();
//        }
//        声明一个Student类型的数组
        Student[] arr = new Student[20];
        for (int i = 0; i < 20; i++) {
//            给数组元素赋值
            arr[i] = new Student();
//            给Student对象的属性赋值
            arr[i].number = i + 1;

            arr[i].state = (int)(Math.random() * ( 6 - 1 + 1 ) + 1 );

            arr[i].score = (int)(Math.random()*(100 - 0 + 1 ));
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].number + "," + arr[i].state + "," + arr[i].score);

        }
        System.out.println("************************************");
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].state == 3){
                System.out.println(arr[i].number + "," + arr[i].state + "," + arr[i].score);
            }
        }
        System.out.println("*************************************");
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1- i; j++) {
                if (arr[j].score > arr[j + 1].score){
                    Student temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].number + "," + arr[i].state + "," + arr[i].score);

        }

    }

}
class Student{
    int number;
    int state;
    int score;

}
