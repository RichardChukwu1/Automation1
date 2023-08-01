package day7;

public class InterClass2 implements InterClass{

    public void shapes() {
        System.out.println("shapes");

    }

    public void areas() {
        System.out.println("area");

    }

    public void noOfSide() {
        System.out.println("no of shapes");

    }

    public static void main(String[] args) {

        InterClass2 obj = new InterClass2();
        obj.shapes();
        obj.areas();
        obj.noOfSide();

    }
}

