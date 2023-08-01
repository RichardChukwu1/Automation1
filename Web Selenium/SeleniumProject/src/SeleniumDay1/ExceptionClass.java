package SeleniumDay1;

public class ExceptionClass {

    public static void main(String[] args){
        System.out.println("Beginning");

        try {
            int divide = 10/0;
            System.out.println(divide);
        }catch (Throwable t){
            System.out.println("Error Occurred");
            System.out.println(t.getMessage());
            t.printStackTrace();
        }


        System.out.println("Ending");


    }
}
