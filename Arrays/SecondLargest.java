package Arrays;
import java.util.*;
public class SecondLargest {
    public static void main(String[] args) {
        int arr[] = {1,4,7,8,9,9,6,6,5};
        int n = arr.length;
        // Brute force 
        // Sort the array O(nlogn)
        Arrays.sort(arr);
        // But there is a problem. The second last element wont give second largest as there can be duplicates element as well. {1,4,5,6,6,7,8,9,9}
        int sec_lar = arr[n-1];
        for(int i=n-2; i>=0; i--) {
            if(arr[i] < sec_lar){
                sec_lar = arr[i];
                break; // after we encounter such case we know that the current element  is sec_lar.
            }
        }
        System.out.println(sec_lar);


        // A better or optimised approach in O(n)

        int lar = arr[0], sl = -1;

        for(int i:arr){
            if(i > lar){
                lar = i;
            }
        }

        for(int i:arr){
             if(i > sl && i < lar){
                sl = i;
            }
        }
        System.out.println("Second largest from a better approach: "+sl);
    }
}
