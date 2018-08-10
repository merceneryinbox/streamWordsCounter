import com.sun.org.apache.bcel.internal.util.ClassPath;

import java.util.ArrayList;
import java.util.List;

public class Main {
    List<Integer> list;
    int i = 1000;

    public Main() {
        list = new ArrayList<>(32);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
    }

    public static void main(String[] args) {
        Main main = new Main();

        System.out.println("main.list before " + main.list);
        changeList(main.list);
        System.out.println("main.list after " + main.list);

        System.out.println("main.i before " + main.i);
        changPrimitive(main.i);
        System.out.println("main.list after " + main.i);
    }

    private static void changPrimitive(int i) {
        i = 1111;
    }

    private static void changeList(List<Integer> list) {
        list = new ArrayList<>();
        list.add(1);
    }
}
