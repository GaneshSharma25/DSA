public class MergeSort {

    public static void sort(int[] arr, int l, int r){

        int m = (l + r -1)/2;
        sort(arr,l,m);
        sort(arr,m+1,r);
        merge(arr,l,m,r);

    }
    public static void merge(int[] arr, int l, int m, int r) {
        
    }
    public static void main(String[] args) {
        
    }
}
