package Arrays;
import java.util.*;

public class removeDuplicates {
    static int handleDuplicates(int arr[], int n){
        // ArrayList<Integer> temp = new ArrayList<>();
        // for(int i:arr){
        //     if(!temp.contains(i)){
        //         temp.add(i);
        //     }
        // }
        // for(int i=0;i<temp.size();i++){
        //     arr[i] = temp.get(i);
        // }
        // return temp.size();

        int i=0, j=i+1;
        while(j < n){
            if(arr[i] == arr[j]) j++;
            else {
                arr[i+1] = arr[j];
                i++;
                j++;
            }
        }
        return i;
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        //if Not sorted then we will use Arrays.sort(arr) to make the array sorted before processing
        int res = handleDuplicates(arr,n);
        for(int i=0; i<=res; i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}
