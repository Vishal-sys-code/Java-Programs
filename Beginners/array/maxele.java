import java.util.Scanner; 
public class maxele {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int elements = sc.nextInt();
        int[] array = new int[elements];
        System.out.println("Enter the elements in the array: ");
        for(int i=0;i<elements;i++){
            array[i] = sc.nextInt();
        }
        System.out.println("The array is: ");
        for(int i=0;i<elements;i++){
            System.out.print(" " + array[i] + " ");
        }
        int maximum_element = array[0];
        int minimum_element = array[0];
        for(int i=0;i<elements;i++){
            if(array[i] > maximum_element){
                maximum_element = array[i];
            }   
            else if(array[i] < maximum_element){
                minimum_element = array[i];
            }
        }
        System.out.println(" The maximum element is: " + maximum_element);
        System.out.println(" The minimum element is: " + minimum_element);
        sc.close();
    }
}
