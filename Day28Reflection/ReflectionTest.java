package Day28Reflection;

import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionTest {
    @Test
    public void FieldTest() throws Exception {
        Class clazz = Person.class;
        // 创建运行时的对象
        Person p = (Person)clazz.newInstance();
        /**
         * 获取指定的属性:要求声明为public
         * 通常不采用此方法
         *
         */
        Field id = clazz.getField("id");

        // 设置当前属性值
        id.set(p,1001);

        // 获取当前属性值
        int pid = (int)id.get(p);
        System.out.println(pid);
    }
    @Test
    public void FieldTest1() throws Exception {
        Class clazz = Person.class;

        // 创建运行时的对象
        Person p = (Person)clazz.newInstance();

        // 获取指定的属性
        Field name = clazz.getDeclaredField("name");

        // 确保当前属性可访问
        name.setAccessible(true);

        // 获取设定指定对象的此属性值
        name.set(p,"Jack");

        System.out.println(name.get(p));
    }
    @Test
    public void FieldMethod() throws Exception {
        Class clazz = Person.class;
        // 创建运行时的对象
        Person p = (Person)clazz.newInstance();
        // 1.后去指定的某个方法
        // getDeclareMethod（）参数1：指明获取方法名称 参数2：指明获取方法的形参列表
        Method showNation = clazz.getDeclaredMethod("showNation", String.class);

        showNation.setAccessible(true);
        // invoke() 参数1：方法的调用者 参数2：给方法形参赋值的实参
        showNation.invoke(p,"CHN");


        System.out.println("*************如何调用静态方法*****************");

        Method showDesc = clazz.getDeclaredMethod("showDesc");
        showDesc.setAccessible(true);
        // 如果调用的运行时类中的方法没有返回值，则此invoke()返回null
        // Object returnVal = showDesc.invoke(null);
        Object returnVal = showDesc.invoke(Person.class);
        System.out.println(returnVal);

    }
}
