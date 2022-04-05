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
        if(data==null){
            return true;
        }
        else{
            return false;
        }
    }

    public void clear(){
        left = right = parent = null;
        data = null;
    }

}
