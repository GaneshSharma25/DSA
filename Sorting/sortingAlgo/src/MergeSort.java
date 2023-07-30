import java.util.Arrays;

public class MergeSort {
    

    public static void sort(int[] arr, int l, int r){
        if(l < r ){
            //find the middle point..
            int m = (l + r-1)/2;
            sort(arr, l, m);
            sort(arr, m+1, r);
            merge(arr,l,m,r);
        }
    }

    public static void merge(int[] arr, int l, int m, int r) {
        //find sizes of two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;

        //create a temp arrays
        int L[] = new int[n1];
        int R[] = new int[n2];

        //copy data to temp array
        for (int i = 0; i < n1; ++i) {
            L[i] = arr[l + i];
        }
        for (int j = 0; j < n2; ++j) {
            R[j] = arr[m + 1 + j];
        }

        //merge the temp array

         // Initial indices of first and second subarrays
        int i = 0; int j = 0;

        //initial index of merged subarray array
        int k = l;

        while(i < n1 && j < n2){
            if(L[i] <= R[j]){
                arr[k] = L[i];
                i++;
            }
            else{
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of L[] if any
        while(i < n1){
            arr[k] = L[i];
            i++;
            k++;
        }

        while(j < n2){
            arr[k] = R[j];
            j++;
            k++;
        }

    }

    public static void main(String[] args) {
        int[] arr = {89,56,42,100,8,57};
        System.out.println(Arrays.toString(arr));
        sort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
        
    }
}
