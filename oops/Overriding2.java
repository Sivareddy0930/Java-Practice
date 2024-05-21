package oops;

class P{
    void m1(){
        System.out.println("parent");
    }
}
public class Overriding2 extends P{
    void m1(){
        System.out.println("child");
    }

    public static void main(String[] args) {
        P obj=new P();
        obj.m1();
        Overriding2 obj1=new Overriding2();
        obj1.m1();
        P obj2=new Overriding2();
        obj2.m1();
    }
}
