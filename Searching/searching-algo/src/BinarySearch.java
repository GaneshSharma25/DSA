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

    public static void main(String[] args) {
        //binary search can work only on sorted array..
        int[] arr = { 1, 5, 9, 48, 65, 98, 111, 152 };
        int key = 198;
        int i = binarySearch(arr, key);
        System.out.println(i);
         
    }

}
