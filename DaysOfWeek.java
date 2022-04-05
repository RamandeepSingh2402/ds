public class DaysOfWeek {
    public static void main(String[] args) {
        String mon = "Monday";
        String tue = "Tuesday";
        String wed = "Wednesday";
        String thu = "Thursday";
        String fri = "Friday";
        String sat = "Saturday";
        String sun = "Sunday";
        for (int i = 0; i < 7; i++) {
            if(i==0){
                System.out.println(i + " " + sun);
            }
            if(i==1){
                System.out.println(i + " " +mon);
            }
            if(i==2){
                System.out.println(i + " " +tue);
            }
            if(i==3){
                System.out.println(i + " " +wed);
            }
            if(i==4){
                System.out.println(i + " " +thu);
            }
            if(i==5){
                System.out.println(i + " " +fri);
            }
            if(i==6){
                System.out.println(i + " " +sat);
            }
        }
    }
}