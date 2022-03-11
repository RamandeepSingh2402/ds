import java.util.Scanner;

public class binaryTree {
    //scanner
    static Scanner in = null;

    //main method
    public static void main(String[] args){
        //initializing the scanner class
        in = new Scanner(System.in);

        //calling the createTree() method
        Node root = createTree();
    }

    /**
     * This is the createTree() method
     * This method creates a tree, and returns the root of that tree.
     * */

    static Node createTree(){

        //creating and initializing a node called root
        Node root = null;

        //asking the user to enter the data
        System.out.println("Enter data: ");

        //taking in the input of the data entered by the user
        int data = in.nextInt();

        //base case for recursion
        if(data==-1){
            return null;
        }

        //overwriting the value stored in the root value by creating a new node with data
        root = new Node(data);

        //asking the user to enter the left side of the data
        System.out.println("Enter left of the data: " + data);

        //calling the createTree() method on the left side to create a tree on the left side of the root node
        root.left = createTree();

        //asking the user to enter the data for the right side of the root node
        System.out.println("Enter right of the data " + data);

        //calling the createTree() method on the right side of the root node to create a tree on the right side of the root node
        root.right = createTree();

        //returning the root node
         return root;
    }
}

//class Node
class Node{

    //declaring the vairables
    Node left;
    Node right;
    int data;

    //constructor of the Node class
    public Node(int data){
        this.data = data;
    }

}
