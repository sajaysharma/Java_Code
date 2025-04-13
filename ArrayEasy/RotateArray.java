public class RotateArray {
    public static void reverse(int[] arr, int start, int end){
        while (start < end)
        {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        int k = 3, n = arr.length;
        
        // for(int i = 0; i < k; i++){
        //     int last = arr[n - 1];
        //     for(int j = n - 2; j >= 0; j--){
        //         arr[j + 1] = arr[j];
        //     }
        //     arr[0] = last;
        // }

        k = k % n;

        reverse(arr, 0, n -1);

        reverse(arr, 0, k -1);
        
        reverse(arr, k, n -1);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
