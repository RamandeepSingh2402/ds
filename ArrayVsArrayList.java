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
        
    }
}
