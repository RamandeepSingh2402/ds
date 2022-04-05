public class BT<T> {
    public static void main(String[] args) {

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
}
