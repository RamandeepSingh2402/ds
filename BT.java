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

    
}
