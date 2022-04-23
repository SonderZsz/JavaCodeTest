package Dont;

import java.util.Objects;

public class ObjectTest {
    private String name;
    private int age;

    public ObjectTest() {
    }

    public ObjectTest(String name, int age) {
        this.name = name;
        this.age = age;
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


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ObjectTest)) return false;
        ObjectTest that = (ObjectTest) o;
        return age == that.age && name.equals(that.name);
    }

    // 重写的原则：比较两个对象的实体对象（即name和age）是否相同
//    @Override
//    public boolean equals(Object obj) {
//        if(this == obj){
//            return true;
//        }
//        if(obj instanceof ObjectTest){
//            ObjectTest obje = (ObjectTest)obj;
//            return this.age == obje.age && this.name.equals(obje.name);
//        }else{
//            return false;
//        }
//    }
}
