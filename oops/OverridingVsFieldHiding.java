package oops;

class Superclass {
    int variable = 10;
    void m1(){
        System.out.println("parent");
    }
}

class Subclass extends Superclass {
    int variable = 20; // This variable hides the variable in Superclass
    void m1(){
        System.out.println("child");
    }
}


public class OverridingVsFieldHiding {
    public static void main(String[] args) {
        Subclass sub = new Subclass();
        System.out.println(sub.variable); // Outputs 20
        sub.m1();//child

        Superclass sup = new Subclass();
        System.out.println(sup.variable); // Outputs 10, not 20
        sup.m1();//child

        Superclass sup1 = new Superclass();
        System.out.println(sup1.variable); // Outputs 10, not 20
        sup1.m1();//parent
    }
}
//shadowing
//Hiding: Does not support polymorphism. When accessing hidden fields,
// the field used is determined statically based on the reference type, not dynamically based on the actual object type.