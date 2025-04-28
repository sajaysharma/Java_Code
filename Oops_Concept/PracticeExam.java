// package Oops_Concept;

class InnerPracticeExam {
      public void matrixProduct(int a[][], int b[][]){
        int c[][] = new int[3][3];
        int n1 = a.length;
        int m1 = a[0].length;
        int n2 = b.length;
        if(m1 != n2){
            System.out.println("Matrix dimantion different not allow");
            return;
        }
        for(int i = 0; i < n1; i++){
            for(int j = 0; j < m1; j++){
                c[i][j] = 0;
                for(int k = 0; k < n1; k++){
                    c[i][j] = c[i][j] + a[i][k] * b[k][j];
                }
            }
        }

        System.out.println("Product: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
      }
    
}

public class PracticeExam {
    public static void main(String[] args) {
        int [][]a = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int [][]b = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        InnerPracticeExam obj = new InnerPracticeExam();
        obj.matrixProduct(a, b);

        // String s = "ajay dfg";
        // String t = "ajay";
        // System.out.println(s.toUpperCase());
        // System.out.println(s.equals(t));
        // System.out.println(s.replaceAll(s, "Akash"));
        // System.out.println(s.trim());
        // System.out.println(s.charAt(3));
        // System.out.println(s.compareTo(t));
        // System.out.println(s.length());
        // System.out.println(s.concat(t));
    }
}
