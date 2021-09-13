import java.util.Scanner;
public class matrix {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.println("Enter the number of columns: ");
        int columns = sc.nextInt();
        int[][] array = new int[rows][columns];
        //taking 2d matrix
        System.out.println("Enter the number of elements: ");
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                array[i][j] = sc.nextInt();
            }
        }
        System.out.println("The array is: ");
        //2d array outputing
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                System.out.print(" " + array[i][j]);
            }
        }

        sc.close();
    }
}
