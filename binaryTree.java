import java.sql.SQLOutput;

public class BinaryTree<T> {
    private T data;
    private BinaryTree<T> parent;
    private BinaryTree<T> left;
    private BinaryTree<T> right;

    public BinaryTree(){
        parent = left = right = null;
        data = null;
    }

    public boolean isEmpty(){
        if(data==null){
            return true;
        }
        else{
            return false;
        }
    }

    public void clear(){
        left = right= parent = null;
        data = null;
    }

    public void makeRoot(T data){
        if(!isEmpty()){
            System.out.println("Can't make root. Already exists");
        }
        else{
            this.data = data;
        }
    }

    public void setData(T data){
        this.data = data;
    }

    public void setLeft(BinaryTree<T> tree){
        left = tree;
    }

    public void setRight(BinaryTree<T> tree){
        right = tree;
    }

    public void setParent(BinaryTree<T> tree){
        parent = tree;
    }

    public T getData(){
        return data;
    }

    public BinaryTree<T> getParent(){
        return parent;
    }

    public BinaryTree<T> getLeft(){
        return left;
    }

    public BinaryTree<T> getRight(){
        return right;
    }

    public void attachLeft(BinaryTree<T> tree){
        if(tree== null){
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

    public void attachRight(BinaryTree<T> tree){
        if(tree==null) {
            return;
        }
        else if(right!=null || tree.getParent()!=null){
            System.out.println("Can't attach");
            return;
        }
        else{
            tree.setParent(this);
            this.setRight(tree);
        }
    }

    public BinaryTree<T> detachLeft(){
        if(this.isEmpty()){
            return null;
        }
        BinaryTree<T> retLeft = this.left;
        this.left = null;
        if(retLeft!=null){
            retLeft.setParent(null);
        }
        return retLeft;
    }

    public BinaryTree<T> detachRight(){
        if(this.isEmpty()){
            return null;
        }
        BinaryTree<T> retRight = right;
        right=null;
        if(retRight!=null){
            retRight.setParent(null);
        }
        return retRight;
    }

    public BinaryTree<T> root(){
        if(this.isEmpty()){
            return null;
        }
        if(this.parent == null){
            return this;
        }
        BinaryTree<T> next = this.parent;
        while(next.getParent()!=null){
            next = next.getParent();
        }
        return next;
    }

    public static<T> void preorder(BinaryTree<T> t){
        if(t!=null){
            System.out.println(t.getData() + "\t");
            preorder(t.getLeft());
            preorder(t.getRight());
        }
    }

    public static<T> void inorder(BinaryTree<T> t){
        if(t!=null){
            inorder(t.getLeft());
            System.out.println(t.getData() + "\t");
            inorder(t.getRight());
        }
    }

    public static<T> void postorder(BinaryTree<T> t){
        if(t!=null){
            postorder(t.getLeft());
            postorder(t.getRight());
            System.out.println(t.getData() + "\t");
        }
    }

}
class BinaryTreeDemo{
    public static void main(String[] args) {
        BinaryTree<String> A = new BinaryTree<String>();
        BinaryTree<String> B = new BinaryTree<String>();
        BinaryTree<String> C = new BinaryTree<String>();
        BinaryTree<String> D = new BinaryTree<String>();
        BinaryTree<String> E = new BinaryTree<String>();
        BinaryTree<String> F = new BinaryTree<String>();
        A.makeRoot("A");
        B.makeRoot("B");
        C.makeRoot("C");
        D.makeRoot("D");
        E.makeRoot("E");
        F.makeRoot("F");

        A.attachLeft(B);
        A.attachRight(C);
        B.attachLeft(D);
        B.attachRight(E);
        D.attachLeft(F);

        System.out.println("Preorder:\t");
        BinaryTree.preorder(A);
        System.out.println();
        System.out.println("Inorder:\t");
        BinaryTree.inorder(A);
        System.out.println();
        System.out.println("Postorder:\t");
        BinaryTree.postorder(A);
        System.out.println();
    }
}