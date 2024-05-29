package Java8;
import java.util.function.Predicate;
interface A<T>{
    void m1(Integer s);
}
public class Fi {

    public static void main(String[] args) {
        Predicate<Integer> p=(a)->a<0;
        System.out.println(p.test(10));

        A<Integer> Fi=(value)->{
            System.out.println(value);
        };
        Fi.m1(1);
    }

}
