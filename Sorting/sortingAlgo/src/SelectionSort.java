import java.util.Arrays;

public class SelectionSort {

    // public static void selectionSort(int[] arr) {
    //     for (int i = 0; i < arr.length; i++) {
    //         for (int j = 0; j < arr.length; j++) {
    //             if (arr[i] < arr[j]) {
    //                 int temp = arr[i];
    //                 arr[i] = arr[j];
    //                 arr[j] = temp;

    //             }
    //         }
    //     }
    // }

    


    public static void selectionSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length ; j++) {
                if(arr[i] < arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }


    public static void selectionSortRec(int[] arr, int i, int j) {
        if (i == arr.length) {
            return;
        }
        if (j == arr.length) {
            j = i+1;
            selectionSortRec(arr, i + 1, j);
            return;
        }
        if (arr[i] > arr[j]) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        selectionSortRec(arr, i, j + 1);

    }

    public static void main(String[] args) {
        int[] arr = { 8, 6, 9, 23, 5, 234, 11, 65 };
        System.out.println("Array : " + Arrays.toString(arr));
       // selectionSortRec(arr, 0, 0);
        selectionSort(arr);
        System.out.println("Selection Sort: " + Arrays.toString(arr));
    }

}
