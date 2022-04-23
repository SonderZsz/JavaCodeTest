package Day25;

import java.util.*;

/**
 * 创建该类的 5 个对象，并把这些对象放入 TreeSet 集合中（下一章：TreeSet 需使用泛型来定义）
 *        分别按以下两种方式对集合中的元素进行排序，并遍历输出：
 *   1). 使 Employee 实现 Comparable 接口，并按 name 排序
 *   2). 创建 TreeSet 时传入 Comparator对象，按生日日期的先后排序。
 *
 */
public class EmployeeTest {
    // 使Employee 实现 Comparable 接口，并按 name 排序
    public static void main(String[] args) {
        TreeSet set = new TreeSet();



        Employee e1 = new Employee("daf",48,new MyDate(1992,4,26));
        Employee e2 = new Employee("zvs",55,new MyDate(1995,1,8));
        Employee e3 = new Employee("rth",23,new MyDate(1972,10,13));
        Employee e4 = new Employee("xcs",46,new MyDate(1978,9,8));
        Employee e5 = new Employee("wf",32,new MyDate(1998,7,6));
        set.add(e1);
        set.add(e2);
        set.add(e3);
        set.add(e4);
        set.add(e5);

        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }


}
