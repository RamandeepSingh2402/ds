public class DaysOfWeek {
    //main method
    public static void main(String[] args) {
        //print statement for the user
        System.out.println("The days of the week, with the proposed integer values are as follows: ");

        //defining Strings with abbreviations for printing them along the proposed integer values of the days
        String mon = "Monday";
        String tue = "Tuesday";
        String wed = "Wednesday";
        String thu = "Thursday";
        String fri = "Friday";
        String sat = "Saturday";
        String sun = "Sunday";

        //for loop for printing the values of the days along with the proposed integer values
        for (int i = 0; i < 7; i++) {
            //for i = 0, we'll print Sunday
            if(i==0){
                System.out.println(i + " " + sun);
            }
            //for i = 1, we'll print Monday
            if(i==1){
                System.out.println(i + " " +mon);
            }
            //for i = 2, we'll print Tuesday
            if(i==2){
                System.out.println(i + " " +tue);
            }
            //for i = 3, we'll print Wednesday
            if(i==3){
                System.out.println(i + " " +wed);
            }
            //for i = 4, we'll print Thursday
            if(i==4){
                System.out.println(i + " " +thu);
            }
            //for i = 5, we'll print Friday
            if(i==5){
                System.out.println(i + " " +fri);
            }
            //for i = 6, we'll print Saturday
            if(i==6){
                System.out.println(i + " " +sat);
            }
        }
    }
}