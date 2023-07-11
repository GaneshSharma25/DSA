import java.util.Arrays;

public class BinarySearch {

    public static int binarySearch(int[] arr, int key) {

        int left = 0;
        int right = arr.length - 1;
        int mid = (left + right) / 2;
        while (left <= right) {
            mid = (left + right) / 2;
            if (key == arr[mid]) {
                return mid;
            }
            if (key < arr[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }

    //Recursive solution..
    public static int binarySearchRec(int[] arr,int key, int left,int right){
        int mid = (left+right)/2;
        int res;
        if(arr[mid] == key) return mid;
        if(key < arr[mid]){
           res =  binarySearchRec(arr, key,left,mid-1);
        }else{
           res =  binarySearchRec(arr,key,mid+1,right);
        }
          if(left > right) return -1;
        return res;
    }

    public static void main(String[] args) {
        //binary search can work only on sorted array..
        // int[] arr = { 1, 5, 9, 48, 65, 98, 111, 152 };
        // int key = 198;
        // int i = binarySearch(arr, key);
        // System.out.println(i);
        int[] arr = {8,6,9,54,87,26,10,9};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(binarySearchRec(arr, 10,0,(arr.length-1)));
         
    }

}
