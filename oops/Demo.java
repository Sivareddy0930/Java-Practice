package oops;

public class Demo {
    strictfp  final static public  void main(String[] args) {
        byte a=10;
        byte b=10;
//byte c=a+b;//Compile Time Error: because a+b=20 will be int
//        byte c=a+10;
        byte c=(byte)(a+10);
        System.out.println(c);
    }
}
