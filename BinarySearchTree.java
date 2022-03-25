import java.util.Scanner;

public class BinarySearchTree {
    //importing the scanner class
    static Scanner sc = null;

    //the main method
    public static void main(String[] args) {
        sc = new Scanner(System.in);

        //calling the createTree method to create the tree
        createTree();
    }

    //createTree method which creates the tree, and returns the root node
    static Node createTree(){

        //declaring and initializing the node root
        Node root = null;

        //prompting the user to enter the data
        System.out.print("Enter the data: ");

        //storing the value entered by the user in data
        int data = sc.nextInt();

        //the base condition of recursion
        if(data == -1){
            return null;
        }

        //declaring the new root, as the sub-trees are themselves the binary trees
        root = new Node(data);

        //prompting the user to enter the left for the data
        System.out.print("Enter the left for " + data);

        //recursive step
        root.left = createTree();

        //prompting the user to enter the data for the right subtree
        System.out.print("Enter the right for " + data);

        //calling the createTree() method for the right subtree
        root.right = createTree();

        //returning the root of the method
        return root;
    }

}

//the Node class
class Node {

    //instance variables
    int data;
    Node left;
    Node right;

    //constructor for the Node class
    public Node(int data){
        this.data = data;
    }
    
}
