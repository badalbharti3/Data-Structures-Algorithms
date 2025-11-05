package Arrays;

class smallestNum {
    static void smallest(int[] arr, int n){
        int min = arr[0];
        int s_min = Integer.MAX_VALUE;
        for(int i:arr){
            if(i < min){
                s_min = min;
                min = i;
            }
            else if(i != min && i < s_min){
                s_min = i;
            }
        }
        if(s_min == Integer.MAX_VALUE) s_min = -1;
        System.out.println("Smallest: "+min+" Second Smallest: "+s_min);
    }

    
   public static void main(String[] args) {
    int arr[] = {1,1,1,1,1};
    int n = arr.length;

    smallest(arr,n);
    // secondSmallest(arr,n);
   }
}
