package Arrays;
import java.util.*;

public class largestElement {
    public static int[] globalArray = {5,8,9,7,4}; // This array can be accessed inside any class. It is declared globally through public static keyword.

    public static void accessingGlobalArray(){
        // accessing global array inside this method.
            System.out.println("Now let's access the global variable: ");
            for(int i:globalArray) {
                System.out.print(i+" ");
            }
    }
        public static void main(String[] args) {

            int[] arr = {1,2,5,4,7,8,9}; // Array Initialization 
            int n = arr.length;
            System.out.println("Original Array: ");
            for(int i=0; i<n; i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println("");
            Arrays.sort(arr); // This method is used to sort the array in sorted order. (From java.util.Arrays)
            System.out.println("After Sorting: ");
            for(int i=0; i<n; i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println("");
            System.out.println("Now after sorting, the last element is the largest that is: "+arr[n-1]);

            // calling the accessGlobalArray method from main method
            // accessingGlobalArray();

            // The more optimised way to sort an array is to traverse through the array and maintain a variable max containing maximum value of the arrat through each traversal.

            System.out.println("Optimised way to find largest: ");

            int max = arr[0]; // taken a var max and assigned the first element of arr to it.
            // now traverse arr and look for the larger values than max

            for(int i:arr){
                if(i > max){
                    max = i;
                }
            }

            System.out.println("The largest element found through this traversal is: "+max);


            // Time complexity : In case 1, we used in-built sorting method which takes nlogn time 
            // but in case 2 we are traversing the array and comparing each value with max which takes n time.
            // n is the length of the array here.
    }
}
