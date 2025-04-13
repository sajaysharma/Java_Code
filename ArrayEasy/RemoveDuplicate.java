public class RemoveDuplicate {
    public static void main(String[] args) {
        int arr[] = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int k = 0;

        for(int i = 1; i < arr.length; i++){
            if(arr[i] != arr[k]){
                arr[k + 1] = arr[i];
                k++;
            }
        }
        System.out.println("After removing all duplicates: ");
        for (int i = 0; i < k + 1; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    
}
