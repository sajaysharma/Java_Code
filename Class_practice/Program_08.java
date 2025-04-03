import java.util.*;

public class Program_08 {
    public static int minJumps(int[] arr) {
        int n = arr.length;
        
        
        if (n <= 1) return 0;
        
        // If the first element is 0, we cannot move anywhere
        if (arr[0] == 0) return -1;
        
        int jumps = 0, farthest = 0, end = 0;
        
        for (int i = 0; i < n - 1; i++) {
            // Update the farthest index we can reach
            farthest = Math.max(farthest, i + arr[i]);
            
            // If we reach the end of the current jump
            if (i == end) {
                jumps++;
                end = farthest;
                
                // If we have reached the last index
                if (end >= n - 1) return jumps;
            }
        }
        
        // If the last index is never reachable
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
        System.out.println("Minimum Jumps: " + minJumps(arr));
    }
}
