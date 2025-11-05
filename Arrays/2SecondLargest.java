package Arrays;
import java.util.*;
class SecondLargest {
    //..........
    static void bruteForceApproach(int[] arr, int n){
        Arrays.sort(arr);
        int s_largest = arr[n-1];
        for(int i=n-2; i>=0; i--) {
            if(arr[i] < s_largest){
                s_largest = arr[i];
                break; 
            }
        }
        System.out.println(s_largest); // Sort the array O(nlogn)
    }

    static void betterApproach(int[] arr, int n){
        int largest = arr[0], s_largest = -1;

        for(int i:arr){
            if(i > largest){
                largest = i;
            }
        }
        for(int i:arr){
             if(i > s_largest && i < largest){
                s_largest = i;
            }
        }
        System.out.println(s_largest); // O(2n)
    }

    static void optimalApproach(int[] arr, int n){
        int largest = arr[0];
        int s_largest = Integer.MIN_VALUE;
        for(int i=1; i<n; i++){
            if(arr[i] > largest){
                s_largest = largest;
                largest = arr[i];
            }
        }
        System.out.println(s_largest);
    }
    public static void main(String[] args) {
        int arr[] = {1,4,7,8,9,9,6,6,5};
        int n = arr.length;
        // Brute force O(nlogn)
        bruteForceApproach(arr,n);
        // A better or optimised approach in O(2n)
        betterApproach(arr, n);
        // optimal approach O(n)
        optimalApproach(arr, n);
    }
}
