import java.util.ArrayList;
import java.util.Arrays;
//import java.util.List;

public class ArrayVsArrayList {
    public static void main(String[] args) {

        //declaring and initializing the arrays with predefined size, and predefined values as well
        //indexes: [0][1][2][3]
        String[] friendsNameArray = {"John", "Chris", "Eric", "Juliano"};

        /*declaring and initializing an arrayList with predefined values
        Arrays.asList() can be used alone as well, but it gives us immutable list (that we can't alter)
        It's better to use it in the way shown below, as it then gives you a mutable list,
        which can be altered, and played around with as well!
        An example can be seen by uncommenting line 22 and line 3
         */

        //List<String> demoImmutableList = Arrays.asList("John","Juliano","Eric","Mick");

        /**
         * THE LIMITATION OF THE ARRAYLIST IS:
         * CAN ONLY HOLD OBJECTSS
         * BUT SUPPORTS WRAPPER TYPES FOR PRIMITIVES (USING INTEGER INSTEAD OF int)
         */

        ArrayList<String> friendsNameArrayList = new ArrayList<>(Arrays.asList("John", "Chris", "Eric", "Juliano"));

        //extracting elements from both, the array as well as the arrayList
        System.out.println(friendsNameArray[1]);
        System.out.println(friendsNameArrayList.get(1));

        //printing the size of each

        //field ".length" for getting the size of the array
        System.out.println(friendsNameArray.length);
        //method call ".size()" for getting the size of the arrayList
        System.out.println(friendsNameArrayList.size());

        /**
         * How to add elements at the end of both??
         * That can't be done for the arrays, as they have a fixed size!
         * ".add()" method will do the work for you for the arrayList
         */

        //adding elements at the end of an arrayList
        friendsNameArrayList.add("Mitch");
        System.out.println(friendsNameArrayList.get(4));

    }
}
