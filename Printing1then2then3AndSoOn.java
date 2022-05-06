public class Printing1then2then3AndSoOn {
    //main method
    public static void main(String[] args) {
        //using for loop to support printing of the stars
        for (int i = 0; i <= 7; i++) {
            //switch statement
            switch (i){
                //printing one star when the value of i is 1
                case 1:
                    System.out.println("*");
                    break;

                //printing two stars when the value of i is 2
                case 2:
                    System.out.println("**");
                    break;

                //printing three stars when the value of is 3
                case 3:
                    System.out.println("***");
                    break;

                //printing four stars when the value of i is 4
                case 4:
                    System.out.println("****");
                    break;

                //printing five stars when the value of i is 5
                case 5:
                    System.out.println("*****");
                    break;

                case 6:
                    System.out.println("******");
                    break;
            }
        }
    }
}
