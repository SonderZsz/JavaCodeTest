import java.util.Scanner;

public class Demo13 {
}
class Circle{
    double radius;
    public double findArea(){
        return Math.PI * radius * radius;
    }
}
class PassObject{

    public static void main(String[] args) {
        PassObject test = new PassObject();
        test.printAreas(new Circle(),5);
    }

    public void printAreas(Circle c , int time){
        for (int i = 1 ; i <= time; i++) {
            c.radius = i;
            System.out.println(c.findArea());
        }
    }
}