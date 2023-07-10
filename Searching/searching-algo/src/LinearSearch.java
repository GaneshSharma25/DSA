import java.util.Scanner;

public class LinearSearch {

    public static int linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {5,3,6,9,7,10};
        System.out.println("Enter number to search..");
        int key = sc.nextInt();
        int i =LinearSearch.linearSearch(arr,key);

        if(i != -1){
            System.out.println(i);
        }else{
            System.out.println("Element not found!!");
        }
         
    }
}
