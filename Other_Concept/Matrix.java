// package Other_Concept;



class InnerMatrix {

    public void MatrixSum(int Matrix1[][], int Matrix2[][]){
        int rows = Matrix1.length;
        int cols = Matrix1[0].length;
        
        if (rows != Matrix2.length || cols != Matrix2[0].length) {
            System.out.println("Cannot add matrices: Dimensions do not match.");
            return;
        }

        int[][] sum = new int[rows][cols];
        System.out.println("Sum of Matrix: ");
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                sum[i][j] = Matrix1[i][j] + Matrix2[i][j];
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
    }
    public void MatrixProduct(int Matrix1[][], int Matrix2[][]){
        int rows1 = Matrix1.length;
        int cols1 = Matrix1[0].length;
        int rows2 = Matrix2.length;
        int cols2 = Matrix2[0].length;

        if(cols1 != rows2){
            System.out.println("Cannot multiply matrices: Incompatible dimensions.");
            return;
        }
        
        int[][] product = new int[rows1][cols2];
        System.out.println("Product of Matrix: ");
        for(int i = 0; i < rows1; i++){
            for(int j = 0; j < cols2; j++){
                for(int k = 0; k < cols1; k++){
                    product[i][j] = product[i][j] + Matrix1[i][k] * Matrix2[k][j];
                }
                System.out.print(product[i][j] + " ");
            }
            System.out.println();
        }
    }
    
}
public class Matrix {
    public static void main(String[] args) {
        InnerMatrix obj = new InnerMatrix();
        int[][] Matrix1 = {{1, 2, 3},{4, 5, 6},{7, 8, 9}};
        int[][] Matrix2 = {{1, 2, 3},{4, 5, 6},{7, 8, 9}};
        // int len1 = Matrix1.length;
        
        obj.MatrixSum(Matrix1, Matrix2);
        obj.MatrixProduct(Matrix1, Matrix2);
    }
}
