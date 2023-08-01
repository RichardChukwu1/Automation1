package day7;

public class AbstractClass2 extends AbstractClass{

    public void display() {

        System.out.println("Implemented class from super class");

    }

    public static void main(String[] args) {

        AbstractClass2 obj = new AbstractClass2();
        obj.display();

    }
}
