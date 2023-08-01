package day6;

public class Constructors2 {


    int i;
    int j;

    public Constructors2() {     // default constructor
        i = 20;
        j = 30;
    }
    public Constructors2(int a, int b){    // prarameterised constructor because it's taken argumeunts
        i = 20;
        j = 30;
    }

    public static void main(String[] args) {
        Constructors2 obj = new Constructors2();
        System.out.println(obj.i);
        System.out.println(obj.j);
    }
}
