public class GroupingCases {
    public static void main(String[] args) {
        int month = 10;

        switch (month){
            case 1 :
            case 2 :
            case 3 :
                System.out.println("Good");
                break;

            case 4 :
            case 5 :
            case 6 :
                System.out.println("Okay");
                break;

            default:
                System.out.println("Perfect");
        }
    }
}

