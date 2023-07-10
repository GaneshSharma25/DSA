public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        int find = 3;
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == find){
                System.out.println("Element found at index "+i);
                flag = true;
                break;
            }
        }
        if(!flag){
            System.out.println("Element not found!!");
        }
    }
}
