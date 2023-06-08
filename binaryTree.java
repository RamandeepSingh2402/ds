//import java.util.*;
//
//public class BinaryTree<T> {
//    private T data;
//    private BinaryTree<T> parent;
//    private BinaryTree<T> left;
//    private BinaryTree<T> right;
//
//    public BinaryTree(){
//        parent = left = right = null;
//        data = null;
//    }
//
////    public static<T> void getBFS(BinaryTree<T> root) {
////        BinaryTree<T> curr = root;
////        while(curr.getLeft()!=null && curr.getRight()!=null){
////            if(curr.getLeft()!=null){
////                curr = curr.getLeft();
////            }
////            else if(curr.getRight()!=null){
////
////            }
////        }
////        // Mark all the vertices as not visited(By default
////        // set as false)
////        boolean visited[] = new boolean[];
////
////        // Create a queue for BFS
////        LinkedList<Integer> queue = new LinkedList<Integer>();
////
////        // Mark the current node as visited and enqueue it
////        visited[s]=true;
////        queue.add(s);
////
////        while (queue.size() != 0)
////        {
////            // Dequeue a vertex from queue and print it
////            s = queue.poll();
////            System.out.print(s+" ");
////
////            // Get all adjacent vertices of the dequeued vertex s
////            // If a adjacent has not been visited, then mark it
////            // visited and enqueue it
////            Iterator<Integer> i = adj[s].listIterator();
////            while (i.hasNext())
////            {
////                int n = i.next();
////                if (!visited[n])
////                {
////                    visited[n] = true;
////                    queue.add(n);
////                }
////            }
////        }
////    }
//
//    public static<T> void DFS(BinaryTree<T> root){
//        Stack<BinaryTree<T>> stack = new Stack<>();
//        stack.add(root);
//        while(stack.isEmpty()==false){
//            BinaryTree<T> curr = stack.pop();
//            if(curr.right!=null){
//                stack.add(curr.right);
//            }
//            if(curr.left!=null){
//                stack.add(curr.left);
//            }
//            System.out.println(" " + curr.data );
//        }
//    }
//    public boolean isEmpty(){
//        if(data==null){
//            return true;
//        }
//        else{
//            return false;
//        }
//    }
//
//    public void clear(){
//        left = right= parent = null;
//        data = null;
//    }
//
//    public void makeRoot(T data){
//        if(!isEmpty()){
//            System.out.println("Can't make root. Already exists");
//        }
//        else{
//            this.data = data;
//        }
//    }
//
//    public void setData(T data){
//        this.data = data;
//    }
//
//    public void setLeft(BinaryTree<T> tree){
//        left = tree;
//    }
//
//    public void setRight(BinaryTree<T> tree){
//        right = tree;
//    }
//
//    public void setParent(BinaryTree<T> tree){
//        parent = tree;
//    }
//
//    public T getData(){
//        return data;
//    }
//
//    public BinaryTree<T> getParent(){
//        return parent;
//    }
//
//    public BinaryTree<T> getLeft(){
//        return left;
//    }
//
//    public BinaryTree<T> getRight(){
//        return right;
//    }
//
//    public void attachLeft(BinaryTree<T> tree){
//        if(tree== null){
//            return;
//        }
//        else if(left!=null || tree.getParent()!=null){
//            System.out.println("Can't attach.");
//            return;
//        }
//        else{
//            this.setLeft(tree);
//            tree.setParent(this);
//        }
//    }
//
//    public void attachRight(BinaryTree<T> tree){
//        if(tree==null) {
//            return;
//        }
//        else if(right!=null || tree.getParent()!=null){
//            System.out.println("Can't attach");
//            return;
//        }
//        else{
//            tree.setParent(this);
//            this.setRight(tree);
//        }
//    }
//
//    public BinaryTree<T> detachLeft(){
//        if(this.isEmpty()){
//            return null;
//        }
//        BinaryTree<T> retLeft = this.left;
//        this.left = null;
//        if(retLeft!=null){
//            retLeft.setParent(null);
//        }
//        return retLeft;
//    }
//
//    public BinaryTree<T> detachRight(){
//        if(this.isEmpty()){
//            return null;
//        }
//        BinaryTree<T> retRight = right;
//        right=null;
//        if(retRight!=null){
//            retRight.setParent(null);
//        }
//        return retRight;
//    }
//
//    public BinaryTree<T> root(){
//        if(this.isEmpty()){
//            return null;
//        }
//        if(this.parent == null){
//            return this;
//        }
//        BinaryTree<T> next = this.parent;
//        while(next.getParent()!=null){
//            next = next.getParent();
//        }
//        return next;
//    }
//
//    public static<T> void preorder(BinaryTree<T> t){
//        if(t!=null){
//            System.out.println(t.getData() + "\t");
//            preorder(t.getLeft());
//            preorder(t.getRight());
//        }
//    }
//
//    public static<T> void inorder(BinaryTree<T> t){
//        if(t!=null){
//            inorder(t.getLeft());
//            System.out.println(t.getData() + "\t");
//            inorder(t.getRight());
//        }
//    }
//
//    public static<T> void postorder(BinaryTree<T> t){
//        if(t!=null){
//            postorder(t.getLeft());
//            postorder(t.getRight());
//            System.out.println(t.getData() + "\t");
//        }
//    }
//
//}
//class BinaryTreeDemo{
//    public static void main(String[] args) {
//        BinaryTree<String> A = new BinaryTree<String>();
//        BinaryTree<String> B = new BinaryTree<String>();
//        BinaryTree<String> C = new BinaryTree<String>();
//        BinaryTree<String> D = new BinaryTree<String>();
//        BinaryTree<String> E = new BinaryTree<String>();
//        BinaryTree<String> F = new BinaryTree<String>();
//        BinaryTree<String> G = new BinaryTree<String>();
//        A.makeRoot("A");
//        B.makeRoot("B");
//        C.makeRoot("C");
//        D.makeRoot("D");
//        E.makeRoot("E");
//        F.makeRoot("F");
//        G.makeRoot("G");
//
//        A.attachLeft(B);
//        A.attachRight(C);
//        B.attachLeft(D);
//        B.attachRight(E);
//        C.attachLeft(F);
//        C.attachRight(G);
//
//
//        System.out.println("Preorder:\t");
//        BinaryTree.preorder(A);
//        System.out.println();
//        System.out.println("Inorder:\t");
//        BinaryTree.inorder(A);
//        System.out.println();
//        System.out.println("Postorder:\t");
//        BinaryTree.postorder(A);
//        System.out.println();
//        BinaryTree.DFS(A);
//
////        BinaryTree.getBFS(A);
//
//    }
//}
//
//
