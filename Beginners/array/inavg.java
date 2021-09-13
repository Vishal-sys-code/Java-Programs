import java.util.Scanner; 
public class inavg {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        System.out.print("Enter the number of elements: ");
        int elements = sc.nextInt();
        int[] array = new int[elements];
        System.out.println("Enter the elements in the array: ");
        for(int i=0;i<elements;i++){
            array[i] = sc.nextInt();
        }
        System.out.print("The array is: ");
        for(int i=0;i<elements;i++){
            System.out.print(" " + array[i] + " ");
        }
        for(int i=0;i<elements;i++){
            sum+=array[i];
        }
        double average = (sum/elements);
        System.out.println("The average is: " + average);
        sc.close();
    }
}
