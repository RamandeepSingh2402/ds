import java.util.HashMap;

public class Maps {

    //main method
    public static void main(String[] args) {

        //creating a HashMap empIds
        HashMap<Integer, String> empIds = new HashMap<>();

        //putting the key-value pairs in the empIds Map
        empIds.put(1,"John");
        empIds.put(2,"Igor");
        empIds.put(3,"Carl");
        empIds.put(4,"Jerry");
        empIds.put(5,"Gino");

        //printing out the HashMap
        System.out.println(empIds);

        //printing out the value of a key (returns null if the key doesn't exist.)
        System.out.println(empIds.get(5));

        //using containsKey method to check if the key-value pair exists for the key
        System.out.println(empIds.containsKey(2));

        //using containsValue method to check if the key-value pair exists for the value
        System.out.println(empIds.containsValue("Gino"));

        //using the put method once again for the same key to check what the code really does
        empIds.put(2,"John");

        //printing the output to check the updated HashMap
        System.out.println(empIds);

        //using the replace method
        empIds.replace(2,"Igor");

        //printing the HashMap once again to check the difference
        System.out.println(empIds);

        //using the putIfAbsent method
        empIds.putIfAbsent(6,"Mick");

        //printing the HashMap once again to check the difference
        System.out.println(empIds);

        //using the remove method to remove the key-value pair based on the key
        empIds.remove(2);

        //printing the HashMap again to check the difference between the outputs after the implementation of remove method
        System.out.println(empIds);

        //putting Igor once again to finish nice and easy
        empIds.put(2,"Igor");

        //printing the HashMap once again to check the updated HashMap
        System.out.println(empIds);
        
    }
}
