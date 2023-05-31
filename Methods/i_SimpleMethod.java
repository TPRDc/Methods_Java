public class i_SimpleMethod {

    public void MyName(){
        System.out.println("My Name is Prince Philip");
    }
    public void MyAge(){
        System.out.println("I am 18 years old");
    }
    public void MyHobby(){
        System.out.println("I love Coding");
    }

    public static void main(String[] args) {
        i_SimpleMethod Sm =new i_SimpleMethod(); // Class Object, where is the class object identifier
        Sm.MyName();
        Sm.MyAge();
        Sm.MyHobby();
    }
}
