package Collection;

import java.util.*;

public class ToArray {
    public static void main(String[] args) {
        ArrayList<Integer> c =new ArrayList<>();
        c.add(10);
        c.add(20);
        c.add(30);
        c.add(40);
//        Collection<Integer> c1 =new ArrayList<>();
//        c1.add(10);
//        c1.add(20);
//        c1.add(30);
//        c1.add(40);
//        System.out.println(c.equals(c1));
//        Object[] arr = c.toArray();
//        for (Object a:arr) {
//            System.out.println(a);
//        }
//        Integer[] IntArr = c.toArray(new Integer[0]);
//        for (Integer a:IntArr) {
//            System.out.println(a);
//        }
//
//        System.out.println(c.get(3));
////        System.out.println(c.remove(0));
//        System.out.println(c.set(0,100));
        System.out.println(c.subList(0,2));
//        ArrayList<Integer> c2  = (ArrayList<Integer>) c.clone();
        System.out.println(c);

        c.sort((a,b)-> b.compareTo(a));
        c.sort(Collections.reverseOrder());
        c.sort(Comparator.reverseOrder());
        System.out.println(c);

        ArrayList al=new ArrayList();
        al.add(10);
        System.out.println(al.size());





    }
}
