package Day28Reflection;

/**
 * @author shkstart
 * @create 2019 上午 10:38
 */
public class Person {

    public String name;
    public int age;
    public int id;

    @Override
    public String toString() {
        return "Day28Reflection.Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person(String name, int age) {

        this.name = name;
        this.age = age;
    }

    private Person(String name) {
        this.name = name;
    }

    public Person() {
        System.out.println("Day28Reflection.Person()");
    }
    private static void showDesc(){
        System.out.println("==");
    }
    public String showNation(String nation){
        System.out.println("我的国籍是：" + nation);
        return nation;
    }
}
