public class Printing5StarsTHen4Then3 {
    //main method
    public static void main(String[] args) {
        //for loop, used to iterate over the integer values of a variable to print the number of stars in each line
        for (int i = 5; i >0 ; i--) {

            //using switch instead of if conditions to check the integer values of i, and print accordingly
            switch (i){

                //case in which five stars will be printed
                case 5:
                    System.out.println("*****");
                    break;

                //case in which four stars will be printed
                case 4:
                    System.out.println("****");
                    break;

                //case in which three stars will be printed to the console
                case 3:
                    System.out.println("***");
                    break;

                //case in which two stars will be printed to the console
                case 2:
                    System.out.println("**");
                    break;

                //case in which a single star will be printed to the console
                case 1:
                    System.out.println("*");
                    break;
            }
        }
    }
}
