package Day25;

import java.util.ArrayList;
import java.util.Iterator;

public class Abc {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(5);
        list.add(5);
        list.add(5);
        list.add(5);
        list.add(5);
        list.add(5);

        for (Integer integer : list) {
            System.out.println(integer);
        }

    }
}
