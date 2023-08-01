public class Branching3 {
    public static void main(String[] args){

        X : for(int n =1; n<=5; n++) {

             for(int i= 10; i>0; i--) {

                if(i==5)
                    break X;

                System.out.print(" "+i);
            }

            System.out.println();
        }
    }
}
