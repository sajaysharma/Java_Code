// package Shorting;
public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = {3, 6, 2, 9, 1, 7};
        int len = arr.length, min;

        for(int i = 0; i < len - 1; i++){
            min = i;
            for(int j = i; j < len; j++){
                if(arr[j] < arr[min]) min = j;
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }

        for (int i : arr) {
            System.out.print(" " + i);
        }
    }
}
