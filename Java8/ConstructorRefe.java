package Java8;


interface Sup{
     ConstructorRefe giveObj();

}
public class ConstructorRefe {
    ConstructorRefe(){
        System.out.println("ConstructorRefe object created");
    }


    public static void main(String[] args) {
        Sup s1 =ConstructorRefe::new;
        System.out.println(s1.giveObj());


    }
}
