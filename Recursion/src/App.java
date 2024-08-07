import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
       // System.out.println("Hello, World!");
      //  System.out.println( findFactorial(5));
       // printNames("ganesh",5);
       // printNumbers(5);
      //  printPalindromeNumbers(0,1,10);
    //   sumOfNumber(5,0);
    //   System.out.println("sum-->"+sumOfNumber(5));
    //int[] arr = {1,5,8,90,34,3};
    //System.out.println(Arrays.toString(reverseArray(arr,0,arr.length-1)) );
    System.out.println(checkPalindrome("Madam",0));
    String s = "A man, a plan, a canal: Panama";
    System.out.println(s.replaceAll("[^a-z0-9]", ""));
   
    }

    //factorial
    public static int findFactorial(int n){
        if(n == 1){
            return 1;
        }
        return findFactorial(n-1) * n;
    }

    public static void printPalindromeNumbers(int start,int prev, int n){
        if(n ==  0){
            return;
        }
       // System.out.print(0+" ");
        System.out.print(start+prev+" ");
        printPalindromeNumbers(prev,start+prev,n-1);
    }

    public static void printNames(String name, int count){
        if(count == 0){
            return;
        }
        System.out.println(name);
        count--;
        printNames(name, count);
    }

    public static void printNumbers(int n){
    
        if(n == 0){
            return;
        }
        printNumbers(n-1);
        System.out.println(n+" ");
    }
    public int fib(int n) {
        if (n == 0) {
            return 1;
        }
    
        return 0;
    }

    public static void printNum(int n, int k){
            if(k > n){
                return;
            }
            printNum(n, k+1);
            System.out.print(k+" ");
    }

    public static void sumOfNumber(int n, int sum){
        if (n < 0) {
            return;
        }
           sumOfNumber(n-1, sum + n);
           System.out.println(n+"-->"+sum );
    }

    public static int sumOfNumber(int n){
        if(n == 1){
            return 1;
        }
        return n + sumOfNumber(n-1);
    }

    public static int[] reverseArray(int[] arr, int l, int r){
        if(l >= r){
            return arr;
        }
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
        return reverseArray(arr, l+1, r-1);
    }

    public static boolean checkPalindrome(String str, int i){

        if(i >= str.length() / 2){
            return true;
        }
        
        if(str.toLowerCase().charAt(i) != str.toLowerCase().charAt(str.length() - i -1)){
            return false;
        }

       return checkPalindrome(str, i + 1); 
    }

    public  static boolean isPalindrome(String s) {
        s = s.toLowerCase(); 
        
       s=  s.replaceAll("[^a-z0-9]", "");
        return checkPalindrome(s,0);
       
    }
}
