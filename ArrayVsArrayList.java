import java.util.ArrayList;
import java.util.Arrays;
//import java.util.List;

public class ArrayVsArrayList {
    public static void main(String[] args) {

        //declaring and initializing the arrays with predefined size, and predefined values as well
        String[] friendsNameArray = new String[4];
        String[] friendsNameArray2 = {"John", "Chris", "Eric", "Juliano"};

        //declaring and creating an object of an arrayList
        ArrayList<String> friendsNameArrayList = new ArrayList<>();

        /*declaring and initializing an arrayList with predefined values
        Arrays.asList() can be used alone as well, but it gives us immutable list (that we can't alter)
        It's better to use it in the way shown below, as it then gives you a mutable list,
        which can be altered, and played around with as well!
        An example can be seen by uncommenting line 22 and line 3
         */

        //List<String> demoImmutableList = Arrays.asList("John","Juliano","Eric","Mick");

        ArrayList<String> friendsNameArrayList2 =
                new ArrayList<>(Arrays.asList("John", "Chris", "Eric", "Juliano"));


    }
}
