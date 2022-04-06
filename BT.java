//BT class
public class BT<T> {

    //instance variables for BT class
    private T data;
    private BT<T> parent;
    private BT<T> left;
    private BT<T> right;

    //constructor for the BT class
    public BT(){
        parent = left= right = null;
        data = null;
    }

    //isEmpty() method, which returns boolean value based on the data contained in the BT
    public boolean isEmpty(){
        return data == null;
    }

    //clear method, used to clear the tree, garbage collector takes the inserted values
    public void clear(){
        left = right = parent = null;
        data = null;
    }

    //makeRoot method, which makes the root of some given data
    public void makeRoot(T data){
        if(!isEmpty()){
            System.out.println("Can't make root, it already exists.");
        }
        else{
            this.data = data;
        }
    }

    //setData() method, which is a setter method for data
    public void setData(T data){
        this.data = data;
    }

    //setLeft() method, which is a setter method for setting the left BinaryTree
    public void setLeft(BT<T> tree){
        left = tree;
    }

    //setRight() method, which is a setter method for setting the right BinaryTree
    public void setRight(BT<T> tree){
        right = tree;
    }

    //setParent() method, which is a setter method for setting the parent of a BinaryTree
    public void setParent(BT<T> tree){
        parent = tree;
    }

    //getData() method, which is a getter method for getting the data of a BinaryTree
    public T getData(){
        return data;
    }

    //getParent() method, which is a getter method for getting the parent of a BinaryTree
    public BT<T> getParent(){
        return parent;
    }

    //getLeft() method, which is a getter method for getting the left tree of a BinaryTree
    public BT<T> getLeft(){
        return left;
    }

    //getRight() method, which is a getter method for getting the right tree of a BinaryTree
    public BT<T> getRight(){
        return right;
    }

    //attachLeft() method, which attaches the tree to the left of BinaryTree
    public void attachLeft(BT<T> tree){
        if(tree == null){
            return;
        }
        else if(left!=null || tree.getParent()!=null){
            System.out.println("Can't attach.");
            return;
        }
        else{
            this.setLeft(tree);
            tree.setParent(this);
        }
    }

    //attachRight() method, which attaches the tree to the right of BinaryTree
    public void attachRight(BT<T> tree){
        if(tree == null){
            return;
        }
        else if(right!=null || tree.getParent()!=null){
            System.out.println("Can't attach.");
            return;
        }
        else{
            tree.setParent(this);
            this.setRight(tree);
        }
    }

    //detachhLeft() method, which detaches the tree to the left of BinaryTree
    public BT<T> detachLeft(){
        if(this.isEmpty()){
            return null;
        }
        BT<T> retLeft = this.left;
        if(retLeft!=null){
            retLeft.setParent(null);
        }
        return retLeft;
    }

    //detachRight() method, which detaches the tree to the right of BinaryTree
    public BT<T> detachRight(){
        if(this.isEmpty()) {
            return null;
        }
        BT<T> retRight = this.right;
        if(retRight!=null){
            retRight.setParent(null);
        }
        return retRight;
    }

    //root() method, which makes root of the tree
    public BT<T> root(){
        if(this.isEmpty()){
            return null;
        }
        if(this.parent == null){
            return this;
        }
        BT<T> next = this.parent;
        while(next.getParent()!=null){
            next = next.getParent();
        }
        return next;
    }

    //preorder() method for preOrder traversal of a Binary Tree
    public static<T> void preOrder(BT<T> tree){
        if(tree!=null){
            System.out.println(tree.getData() + "\t");
            preOrder(tree.getLeft());
            preOrder(tree.getRight());
        }
    }

    //inorder() method for inOrder traversal of a Binary Tree
    public static<T> void inOrder(BT<T> tree){
        if(tree!=null){
            inOrder(tree.getLeft());
            System.out.println(tree.getData() + "\t");
            inOrder(tree.getRight());
        }
    }

    //postorder() method for postOrder traversal of a Binary Tree
    public static<T> void postOrder(BT<T> tree){
        if(tree!=null){
            postOrder(tree.getLeft());
            postOrder(tree.getRight());
            System.out.println(tree.getData());
        }
    }
}
class BTRunner{
    public static void main(String[] args) {
        BT<String> A = new BT<String>();
        BT<String> B = new BT<String>();
        BT<String> C = new BT<>();
        BT<String> D = new BT<>();
        BT<String> E = new BT<>();
        BT<String> F = new BT<>();
        BT<String> G = new BT<>();
        A.makeRoot("A");
        B.makeRoot("B");
        C.makeRoot("C");
        D.makeRoot("D");
        E.makeRoot("E");
        F.makeRoot("F");
        G.makeRoot("G");

        A.attachLeft(B);
        A.attachRight(C);
        B.attachLeft(D);
        B.attachRight(E);
        C.attachLeft(F);
        C.attachRight(G);


        System.out.println("Preorder:\t");
        BT.preOrder(A);
        System.out.println();
        System.out.println("Inorder:\t");
        BT.inOrder(A);
        System.out.println();
        System.out.println("Postorder:\t");
        BT.postOrder(A);
        System.out.println();
    }

}