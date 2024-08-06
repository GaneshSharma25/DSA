import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args){

        System.out.println("result-->"+countNumberOfDigits(54623));
        System.out.println(isArmstrong(153));
        // System.out.println1("--------------------->" + reverse(1534236469));
        // // System.out.println("Hello, World!");
        // int c = evenlyDivides(12);
        // System.out.println("-->" + c);
        // // Create first linked list l1 = [2, 4, 3]
        // ListNode l1 = new ListNode(0);
        // // l1.next = new ListNode(4);
        // // l1.next.next = new ListNode(3);

        // // Create second linked list l2 = [5, 6, 4]
        // ListNode l2 = new ListNode(1);
        // // l2.next = new ListNode(6);
        // // l2.next.next = new ListNode(4);

        // ListNode res = addTwoNumbers(l1, l2);
        // System.out.println("hi......");


    }


    //#region  DSA 

    public static int countNumberOfDigits(int num){
        return ((int)Math.log10(num)) + 1;    
    }

    public boolean isPalindrome(int x) {
        int num = x;
        int result = 0;
        while(x > 0){
            result = (result * 10)+ x % 10;
            x /= 10;
        }
        if(num == result){
            return true;
        }
        return false;
    }

    public static boolean isArmstrong(int x){
        int numDigitCount = (int)(Math.log10(x) + 1);
        int result = 0;
        int num = x;
        while(x > 0){
            result = result + (int)Math.pow(x % 10, numDigitCount) ;
            x /= 10;
        }
        if(result == num){
            return true;
        }
        return false;
    }

    public static boolean isPrime(int num){
        int count = 0;
        for (int i = 1; i <= Math.sqrt(num); i++) {
            if(num % i == 0){
              count++;
              if(num/i != i){
                count++;
              }
            }
        }
        if(count == 2){
            return true;
        }
        return false;
    }
    //#endregion

    static int evenlyDivides(int N) {
        // code here
        int count = 0;
        int temp = N;
        while (temp != 0) {
            int num = temp % 10;
            if (N % num == 0) {
                count++;
            }
            temp /= 10;
        }
        return count;
    }

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        return null;
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        int resultNum = reverseNumber(linkedListNum(l1)) + reverseNumber(linkedListNum(l2));
        ListNode resListNode = null;

        ListNode prevNode = null;
        ListNode currentNode = null;
        boolean check = true;

        if (resultNum == 0) {
            return new ListNode(resultNum);
        }

        while (true) {

            int num = resultNum % 10;

            if (resultNum == 0) {
                break;
            }
            resultNum /= 10;

            currentNode = new ListNode(num);

            if (prevNode != null) {
                prevNode.next = currentNode;
            }

            prevNode = currentNode;
            if (check) {
                resListNode = prevNode;
                check = false;
            }

        }
        return resListNode;
    }

    public static int concatNum(int originalNum, int num) {
        return originalNum * 10 + num;
    }

    public static int linkedListNum(ListNode l1) {
        int result = 0;
        ListNode currentNode = l1;

        while (true) {
            if (currentNode == null) {
                break;
            }
            result = concatNum(result, currentNode.val);
            currentNode = currentNode.next;
        }
        return result;
    }

    public static int reverseNumber(int num) {
        int temp = num;
        int result = 0;
        while (true) {
            if (temp == 0) {
                break;
            }
            result = result * 10 + temp % 10;
            temp /= 10;
        }

        return result;
    }

    // * Definition for singly-linked list.
    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static int reverse(int x) {

        String num = Integer.toString(x);
        if(num.contains("-")){
            num = num.replace("-", "");
        }
        String res = "";

        for (int i = 0; i < num.length(); i++) {
            res = num.charAt(i) + res;            
        }
       if(x < 0){
        res = "-"+ res;
       }
      try {
        int result = Integer.parseInt(res);
        return result;
      } catch (Exception e) {
       return 0;
      }

        
    }



}
