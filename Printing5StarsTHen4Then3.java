public class Printing5StarsTHen4Then3 {
    public static void main(String[] args) {
        for (int i = 5; i >0 ; i--) {
            switch (i){
                case 5:
                    System.out.println("*****");
                    break;

                case 4:
                    System.out.println("****");
                    break;

                case 3:
                    System.out.println("***");
                    break;

                case 2:
                    System.out.println("**");
                    break;

                case 1:
                    System.out.println("*");
                    break;
            }
        }
    }
}
