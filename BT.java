public class BT<T> {
    public static void main(String[] args) {
        BT<String> A = new BT<>();
        BT<String> B = new BT<>();
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

        System.out.println("Preorder: ");
        BT.preorder(A);
        System.out.println("Inorder: ");
        BT.inorder(A);
        System.out.println("Postorder: ");
        BT.postorder(A);
    }
    private T data;
    private BT<T> parent;
    private BT<T> left;
    private BT<T> right;
    public BT(){
        parent = left= right = null;
        data = null;
    }

    public boolean isEmpty(){
        return data == null;
    }

    public void clear(){
        left = right = parent = null;
        data = null;
    }

    public void makeRoot(T data){
        if(!isEmpty()){
            System.out.println("Can't make root, it already exists.");
        }
        else{
            this.data = data;
        }
    }
    public void setData(T data){
        this.data = data;
    }

    public void setLeft(BT<T> tree){
        left = tree;
    }

    public void setRight(BT<T> tree){
        right = tree;
    }

    public void setParent(BT<T> tree){
        parent = tree;
    }

    public T getData(){
        return data;
    }

    public BT<T> getParent(){
        return parent;
    }

    public BT<T> getLeft(){
        return left;
    }

    public BT<T> getRight(){
        return right;
    }

    public void attachLeft(BT<T> tree){
        if(tree == null){
            return;
        }
        else if(left!=null || tree.getParent()!=null){
            System.out.println("Can't attach.");
        }
        else{
            this.setLeft(tree);
            tree.setParent(this);
        }
    }

    public void attachRight(BT<T> tree){
        if(tree == null){
            return;
        }
        else if(right!=null || tree.getParent()!=null){
            System.out.println("Can't attach.");
        }
        else{
            tree.setParent(tree);
            this.setRight(this);
        }
    }

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

    public static<T> void preorder(BT<T> tree){
        if(tree!=null){
            System.out.println(tree.getData() + "\t");
            preorder(tree.getLeft());
            preorder(tree.getRight());
        }
    }

    public static<T> void inorder(BT<T> tree){
        if(tree!=null){
            inorder(tree.getLeft());
            System.out.println(tree.getData() + "\t");
            inorder(tree.getRight());
        }
    }

    public static<T> void postorder(BT<T> tree){
        if(tree!=null){
            postorder(tree.getLeft());
            postorder(tree.getRight());
            System.out.println(tree.getData());
        }
    }


}
