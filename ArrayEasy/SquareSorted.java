public class SquareSorted {
    public static void main(String[] args) {
        int arr[] = {-4,-1,0,3,10};
        int n = arr.length;
        int[] ans = new int[n];
        int left = 0, right = n - 1;
        for(int i = n - 1; i >= 0; i--){
            int val;
            if(Math.abs(arr[left]) < Math.abs(arr[right])){
                val = arr[right];
                right--;
            }else{
                val = arr[left];
                left--;
            }
            ans[i] = val * val;
        }
       
        System.out.println("Array: ");
        for (int i : ans) {
            System.out.print(i + " ");
        }
    }
}
