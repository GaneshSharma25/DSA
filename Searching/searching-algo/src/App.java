import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        // int[] arr = new int[5];
        // for (int i = 0; i < arr.length; i++) {
        //     arr[i] = i;
        // }
        // int find = 3;
        // boolean flag = false;
        // for (int i = 0; i < arr.length; i++) {
        //     if(arr[i] == find){
        //         System.out.println("Element found at index "+i);
        //         flag = true;
        //         break;
        //     }
        // }
        // if(!flag){
        //     System.out.println("Element not found!!");
        // }
        int[] arr = {8,6,9,54,87,26,10,9};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(binarySearch(arr, 101));
    }

    public static int binarySearch(int[] arr, int key){

        int left = 0;
        int right = arr.length-1;
        int mid;
        while(right >= left){
            mid = (left+right)/2;
            if(arr[mid] == key){
                return mid;
            }
            if(arr[mid] > key){
                right = mid -1;
            }else{
                left = mid +1;
            }
        }
        return -1;
    }
    
}
