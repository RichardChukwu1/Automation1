public class Branching2 {

    public static void main(String[] args) {
        /**
         * 1st- 1= 10 9 8 7 6 --1
         * 2nd - 2= 10 ----------1
         */
        for(int n =1; n<=5; n++) {
            for(int i= 10; i>0; i--) {

                System.out.print(" "+i);
            }

            System.out.println();
        }
    }
}
