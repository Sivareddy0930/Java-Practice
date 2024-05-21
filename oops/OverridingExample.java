package oops;
class B{
    int a=10;
    void m1(){
        System.out.println("parent");
    }
}
public class OverridingExample extends B {
    void m2(){
        System.out.println("child specific method");
    }
    void m1(){
        System.out.println("child");

    }
    public static void main(String[] args) {
        B obj = new OverridingExample();
        obj.m1();
//        obj.m2(); //CE
//        System.out.println(obj.a);
        OverridingExample obj1 = new OverridingExample();
        obj1.m1();
        obj1.m2();
        System.out.println(obj1.a);
    }
}
