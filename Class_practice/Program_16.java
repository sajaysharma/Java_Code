import java.util.Arrays;

public class Program_16 {
    public static void main(String[] args) {
        int[] arr = { 1, 0, 2, 1, 2, 0, 1 };

        Arrays.sort(arr);

        
        int start = 0;
        int last = arr.length - 1;
        while (start < last) {
            if (arr[start] == 1 || arr[start] == 2) {
                int temp = arr[start];
                arr[start] = arr[last];
                arr[last] = temp;
                last--;
            } else {
                start++;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i]);
        }
    }
}
