public class bubbleSort {
    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = 4;
        arr[1] = 3;
        arr[2] = 7;
        arr[3] = 1;
        arr[4] = 5;
        for(int i = 0; i<5;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
        int[] array = sort.sorted(arr);
        for (int j = 0; j < 5; j++) {
            System.out.print(arr[j] + " ");
        }
    }
    static class sort {
        public int[] a;
        public sort(int[] arr){
            this.a = arr;
        }
        public static int[] sorted(int[] a){
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 5-1-i; j++) {
                    if(a[j+1]<a[j]){
                        int temp = a[j];
                        a[j] = a[j+1];
                        a[j+1] = temp;
                    }
                }
            }
            return a;
        }
    }
}
