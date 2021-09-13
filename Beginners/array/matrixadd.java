import java.util.Scanner; 
public class matrixadd {

    //printing the matrices
    static void printMatrix(int matrix[][], int rowSize, int columnSize){
        for(int i=0;i<rowSize;i++){
            for(int j=0;j<columnSize;j++){
                System.out.println(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    //adding two matrices
    static int[][] addMatrix(int A[][], int B[][], int size){
        int C[][] = new int[size][size];
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                C[i][j] = A[i][j] + B[i][j];
            }
        }
        return C;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //size = row x column [2x3][3x4] => [2x4]
        System.out.println("Enter the size of 2D array: ");
        System.out.print("Size:");
        int size = sc.nextInt();
        System.out.print("Enter the rows and columns of an 2D array: ");
        System.out.print("Rows:");
        int row = sc.nextInt();
        System.out.print("Columns:");
        int column = sc.nextInt();
        int[][] A = new int[row][column];
        int[][] B = new int[row][column];

        
        System.out.print("MATRIX A:");
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                A[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nMatrix A:");
        printMatrix(A, size, size);

        System.out.print("MATRIX B:");
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                B[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nMatrix B:");
        printMatrix(B, size, size);

        int C[][] = addMatrix(A, B, size);

        System.out.println("\nResultant Matrix:");
        printMatrix(C, size, size);

        sc.close();
    }
}
