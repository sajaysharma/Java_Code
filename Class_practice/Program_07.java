import java.util.Scanner;

class Program_07 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        
        char[] charArray = str.toCharArray();

       
        int len = charArray.length;

        int left = 0;
        int right = len - 1;

        while(left < right){
            char c = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = c;
            left++;
            right--;
        }

        for(int i = 0; i < len; i++){
            System.out.printf( "'%s'" ,charArray[i]);
        }


        // System.out.println("Length of the string: " + length);
        // System.out.println("Length of the CharArry: " + len);
        // System.out.println("Reverse of the string: " + reversed);

        // if (str.equals(reversed)) {
        //     System.out.println("Palindrome string");
        // } else {
        //     System.out.println("Not a palindrome");
        // }
    }

}