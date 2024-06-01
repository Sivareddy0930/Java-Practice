package Java8;

public class MethodRefe {
    void m1(){
        System.out.println("MethodRefe m1() method");
    }

    public static void main(String[] args) {
        MethodRefe obj = new MethodRefe();
//        Runnable r = obj::m1;
        Runnable r = ()-> obj.m1();

//        r.run();
        Thread t1=new Thread(r);
        t1.start();

    }
}
