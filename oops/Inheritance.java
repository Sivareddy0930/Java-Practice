package oops;

class A{
    int a=10;
    void m1(){
        System.out.println("parent method");
    }
}

public class Inheritance extends A {
    int a=4;
    public static void main(String[] args) {
        A obj = new Inheritance();
        System.out.println(obj.a);
        obj.m1();
    }
}
