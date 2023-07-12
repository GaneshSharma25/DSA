import java.util.Arrays;

public class BubbleSort {

    public static void bubbleSort(int[] arr) {
        boolean swapFlag = false;
        for (int i = 0; i <= arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1-i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapFlag = true;
                }
            }
            if(!swapFlag){
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 8, 6, 9, 23, 5, 234, 11, 65 };
        System.out.println("Array : " + Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println("Bubble Sort: " + Arrays.toString(arr));
    }

}
