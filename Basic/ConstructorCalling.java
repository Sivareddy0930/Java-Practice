package Basic;

public class ConstructorCalling {
    ConstructorCalling(){
        this(10);
    }
    ConstructorCalling(int a){
        System.out.println(a);
    }
    ConstructorCalling(String a){
this(10);
    }

    public static void main(String[] args) {
        ConstructorCalling obj =new ConstructorCalling();
        ConstructorCalling obj1 =new ConstructorCalling("hi");
    }
}
