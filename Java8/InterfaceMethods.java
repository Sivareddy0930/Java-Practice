package Java8;
//interface Interf{
////    public abstract void  m1();
//    default void m2(){
//        System.out.println("Interface default method");
//    }
//
//    static void m3(){
//        System.out.println("Interface static method");
//    }
//}
//public class InterfaceMethods implements Interf {
//    public void m2(){
//        System.out.println("Interface default method is Overridden");
//    }
//    public static void main(String[] args) {
//        InterfaceMethods obj = new InterfaceMethods();
//        obj.m2();
//        Interf.m3();
//    }
//}


//==============================================================

interface Interf{
    //    public abstract void  m1();
    default void m2(){
        System.out.println("Interface default method");
    }

    static void m3(){
        System.out.println("Interface static method");
    }
}
public class InterfaceMethods  {
    public void m2(){
        System.out.println("Interface default method is Overridden");
    }
    public static void main(String[] args) {
        InterfaceMethods obj = new InterfaceMethods();
        obj.m2();
        Interf.m3();
    }
}