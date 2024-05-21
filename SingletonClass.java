public class SingletonClass {
    private static SingletonClass s=null;
   private SingletonClass(){

    }
    public static SingletonClass getInstance(){
       if(s==null){
           return new SingletonClass();
       }
       return s;
    }
    public static void main(String[] args) {
        SingletonClass obj1=getInstance();
        SingletonClass obj2=getInstance();
        SingletonClass obj3=getInstance();
    }
}
