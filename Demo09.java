public class Demo09 {
    public static void main(String[] args) {
        Demo08 person = new Demo08();
        person.age = 15 ;
        person.name = "Yellow";
        person.sex = 0 ;

        person.study();
        person.showAge();
        int newAge = person.addAge(2);
        System.out.println(newAge);
    }
}
