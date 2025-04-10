import java.util.Scanner;

class InnerAllSorting {

    public void Selection(int arr[], int len){
        int min;

        for(int i = 0; i < len - 1; i++){
            min = i;
            for(int j = i; j < len; j++){
                if(arr[j] < arr[min]) min = j;
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        System.out.println("Sorted Array By Selection: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
    
    public void BubbleSort(int arr[], int size){

        for(int i = size; i >= 1; i--){
            for(int j = 0; j < size - 1; j++){
                if(arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("Sorted Array By Bubble: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
    
    public void InsertionSorting(int arr[], int size){
        for(int i = 0; i < size; i++){
            int j = i;
            while (j > 0 && arr[j - 1] > arr[j]) {
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
                j--;
            }
        }
        System.out.println("Sorted Array By Insertion: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
public class AllSorting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        InnerAllSorting obj = new InnerAllSorting();

        System.out.println("Enter size of Array: ");
        int size = scanner.nextInt();

        int[] arr = new int[size];
        
        System.out.println("Enter element of Array: ");
        for(int i = 0; i < 5; i++){
            arr[i] = scanner.nextInt();
        }
        System.out.println("----------------Enter a Choice---------------");
        System.out.println("Press 1 for Selection Sort \nPress 2 for Bubble Sort \nPress 3 for Insertion Sort\nPress any key for exit");
        int Choice = scanner.nextInt();

        switch (Choice) {
            case 1:
                obj.Selection(arr, size);
                break;
            case 2:
                obj.BubbleSort(arr, size);
                break;
            case 3:
                obj.InsertionSorting(arr, size);
                break;
        
            default:
                System.out.println("Invalid choice! Dhanyawaad & Try Again");
                break;
        }

    }
}
