package Arrays;
import java.util.Scanner;

class checkSorted {
    static void checkSortedness(int arr[], int n){
        for(int i=1; i<n; i++){
            if(arr[i-1] > arr[i]){
                System.out.println("False");
                return;
            }
        }
        System.out.println("True");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of array: ");
        int n = sc.nextInt(); 
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        checkSortedness(arr,n);
        sc.close();
    }
}
