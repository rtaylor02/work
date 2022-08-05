package rtaylor02;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main implements MyInt {
    public static void main(String... a) {
        Main mm = new Main();
        System.out.println(mm.hashCode());
        System.out.println("&&&&&&&&&&&&&&&&&&&");

        int max = Integer.MAX_VALUE;
        int overMax = max + 1000;
        int impossible = 3;
        System.out.println(overMax);

        System.out.println("===================");
        List<Integer> li = new ArrayList<>();
        System.out.println(li.add(3));
        li.add(4);
        li.add(1,1);
        System.out.println(li);
        li.remove(1);
        li.add(5);
        li.add(6);
        System.out.println(li);
        List<Integer> li2 = li.subList(1,li.size());
        System.out.println(li2);

        System.out.println("-------------------------");
        Long l = new Long(3);
        Byte b = new Byte("2");
        b++;
        System.out.println("b = " + b);
//        System.out.println("b = " + b);

        System.out.println("====================");
        int i = 9;
        m1(i++);
        System.out.println("i now = " + i);
        m1(++i);
        System.out.println("i now = " + i);

        System.out.println("====================");
        System.out.println(checkList(li, al -> al.isEmpty()));

        System.out.println("=================");
        int ii = Integer.parseInt("2");
        switch(ii) {
            case 0:
                boolean bb = false;
                break;
            case 1:
                bb = true;
                break;
        }

        System.out.println("================");
        System.out.println("myValue = " + Main.myValue);
        Main m = new Main();
        MyInt.m11();
        m.m12();

        System.out.println("================");
        System.out.println("Math.round(0.5) = " + Math.round(0.5)); // 1
        System.out.println("Math.round(-0.5) = " + Math.round(-0.5)); // 0
        System.out.println("Math.round(-0.6) = " + Math.round(-0.6)); // -1

        System.out.println("+++++++++++++++");
        String s1 = "one";
        String s2 = "two";
        System.out.println(s1.equals(s1=s2)); // false
        System.out.println(s1); // two

        System.out.println("****************");
        Integer val1 = new Integer(5);
        System.out.println("val1 reference: " + val1.hashCode());
        int val2 = 9;
        testInts(val1, val2);
        testInts(val1++,++val2);
        System.out.println(val1 + " " + val2);
        System.out.println("val1 reference: " + val1.hashCode());

        String sss = null;
        System.out.println(sss);
        sss += "1";
        System.out.println(sss);

        for(int ik = 0; ik<-1; ik++) {
            System.out.println("Horray");
        }

        int ss = 5;
        ss += ss + ++ss + mx(ss);
        System.out.println("ss = " + ss);

        Long ln = new Long(42);
        Integer in = new Integer(42);
        Double db = new Double(42);

//        ln == in;
        System.out.println("-----------------");
        String st = null;
        System.out.println('a' + 1);

        MyClass1 mc = new MyClass1();
        mc.m1();
    }



    static {
        Main m = new Main();
        m.getX();
    }

    static int mx(int s) {
        for(int i = 0; i < 3; i++) {
            s = s + i;
        }
        return s;
    }

    int getX() { return x;}

    int x = 5;
    public void looper() {
        int x = 0;
        while((x = getX()) != 0) {
            for(int m = 10; m >= 10; --m) { x = m;}
        }
    }

    public static void testInts(Integer obj, int var) {
        obj = var++;
        System.out.println("obj reference: " + obj.hashCode());
        obj++;
        System.out.println("obj reference: " + obj.hashCode());

    }

    static void m1(int i) {
        System.out.println("i = " + i);
    }

    public static boolean checkList(List list, Predicate<List> p) {
        return p.test(list);
    }
}

interface MyInt {
    int myValue = 1000;
    static void m11() {
        System.out.println("MyInterface.m11()");
    }
    default void m12() {
        System.out.println("MyInterface m12()");
    }
}

class MyClass1 implements MyInt1 {

}


interface MyInt1 {
    default void m1() {}
}
