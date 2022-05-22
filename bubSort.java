public class bubSort {
    public static void main(String[] args){
        int[] arr = {4,7,3,2,5,6,9,8};
        int n = arr.length;
        for(int i = 0; i<n-1;i++){
            for(int j = 0; j<n-1-i; j++){
                if(arr[j+1]<arr[j]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
