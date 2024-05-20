package Basic;

public class Demo {
    public static void main(String[] args) {
        short a=100;
        short b=100;
//        a += b;   //a=a+b; => internally so fine
      //  a=a+b;//Compile time error because 100+100 = 200 now int
        System.out.println(a);

    }
}
