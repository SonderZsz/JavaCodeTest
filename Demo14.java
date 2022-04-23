public class Demo14 {
    public static void main(String[] args) {
        Person p = new Person(15,"laowang",1);
        System.out.println(p.name);
        p.chi();
    }
}
    class Person {
        //  属性
        int age;
        String name;
        int sex;

        // 构造器
        //  一旦显式的定义了类的构造器之后，系统就不再提供默认的空参构造器了


        public Person(int age, String name, int sex) {
            this.age = age;
            this.name = name;
            this.sex = sex;
        }

        // 方法
        public void chi() {
            System.out.println("Human can eat.");
        }
    }

