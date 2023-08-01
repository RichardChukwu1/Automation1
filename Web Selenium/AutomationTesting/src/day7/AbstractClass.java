package day7;

public abstract class AbstractClass {


    public abstract void display();       //Abstract method- body not  implemented

    public static void chat(){

        System.out.println("chat");
    }

    public void wheeling(){      //concrete method- body implemented

        System.out.println("wheeling");

    }


    public static void main(String[] args){
        AbstractClass.chat();

        //AbstractClass obj = new AbstractClass();    it throws error b/c you cannot create an object of an abstract class

    }
}
