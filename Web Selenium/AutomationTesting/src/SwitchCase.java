public class SwitchCase {
    public static void main(String[] args) {
        // switch case
                int month = 1;

        switch (month){
            case 1 :
                System.out.println("Jan");
                //break;

            case 2 :
                System.out.println("Feb");
                break;

            case 12 :
                System.out.println("Dec");
                break;

            default:
                System.out.println("Not a good month");
        }
    }
}
