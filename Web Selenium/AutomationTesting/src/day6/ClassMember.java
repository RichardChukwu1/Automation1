package day6;

public class ClassMember {


    int noOfWheel = 4;                                       //None Static variabl
    static int noOfDoors = 6;                                       //static variables

    public void speed() {                                            //non static method
        System.out.println("Hello non static Method");
    }
    public static void gear(){                                       //non static method
        System.out.println("Hello static Method");
    }



    public static void main(String[] args) {

        System.out.println(ClassMember.noOfDoors);
        ClassMember.gear();

        //classname obj = new className();
        ClassMember obj = new ClassMember();   //created an object
        System.out.println(obj.noOfWheel);
        obj.speed();


    }
}
