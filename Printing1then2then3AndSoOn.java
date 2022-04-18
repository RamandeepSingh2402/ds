public class Printing1then2then3AndSoOn {
    //main method
    public static void main(String[] args) {
        for (int i = 0; i <= 5; i++) {
            switch (i){
                case 1:
                    System.out.println("*");
                    break;

                case 2:
                    System.out.println("**");
                    break;

                case 3:
                    System.out.println("***");
                    break;

                case 4:
                    System.out.println("****");
                    break;

                case 5:
                    System.out.println("*****");
                    break;
            }
        }
    }
}
