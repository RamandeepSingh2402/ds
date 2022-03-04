public class insert {
    public static void main(String[] args) {
        int n = 6;
        int[] a = new int[n];
        a[0] = 8;
        a[1] = 4;
        a[2] = 1;
        a[3] = 5;
        a[4] = 9;
        a[5] = 2;
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("");
        int[] sortedArray = new int[n];
        new insertionSort(a);
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }

}
    class insertionSort {
        public int[] a;
        public insertionSort(int[] a){
            insert(a);
        }
        public int[] insert(int[] a){
            for (int i = 0; i < a.length; i++) {
                int temp = a[i];
                int j = i-1;
                while(j>=0 && a[j]>temp){
                    a[j+1] = a[j];
                    j--;
                }
                a[j+1] = temp;
            }
            return a;
        }
    }
