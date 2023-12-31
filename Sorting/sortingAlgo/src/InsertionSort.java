import java.util.Arrays;

public class InsertionSort {

    public static void insertion(int[] arr) {

        int temp = arr[arr.length - 1];
        int j;
        for (j = arr.length - 2; j >= 0 && arr[j] > temp; j--) {
            arr[j + 1] = arr[j];
        }
        arr[j + 1] = temp;
    }

    // public static void insertionSort(int[] arr) {
    //     for (int i = 1; i < arr.length; i++) {
    //         int temp = arr[i];
    //         int j;
    //         for (j = i - 1; j >= 0 && arr[j] > temp; j--) {
    //             arr[j + 1] = arr[j];
    //         }
    //         arr[j + 1] = temp;

    //     }
    // }


   // public static void insertionSort(int[] arr){
    //     for (int i = 1; i < arr.length; i++) {
    //         int temp = arr[i];
    //         int j = 0;
    //     for ( j = i-1; j>=0 && arr[j] > temp; j--) {
    //         arr[j+1] = arr[j];
    //     }
    //     arr[j+1] = temp;
    //     }
    // }

    public static void insertionSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                if(arr[i] < arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

   

    public static void main(String[] args) {
        int[] arr = { 8, 6, 9, 23, 5, 234, 11, 65 };
        int[] arr2 = { 6, 8, 9, 11, 23, 65, 234, 5 };
        System.out.println("Array : " + Arrays.toString(arr));
        insertionSort(arr);
        System.out.println("insertionSort: " + Arrays.toString(arr));
        
    }

}
