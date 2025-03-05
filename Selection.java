import java.util.*;

public class Selection {
    public static void printArray(int arr[]) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main (String args[]) {

        int arr[] = {7, 8, 3, 1, 2};

        // Selection sort
        for(int i = 0; i < arr.length - 1; i++) {
            int smallest = i;
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[smallest] > arr[j]) {  // Corrected condition
                    smallest = j;
                }
            }
            // Swap elements
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }

        printArray(arr);
    }
}
