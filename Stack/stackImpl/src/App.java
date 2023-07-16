import StackPkg.Stack;

public class App {

    public static void main(String[] args) {
        Stack stack = new Stack();
       
        System.out.println( stack.push(50));
         stack.push(95);
        stack.push(100);
        stack.display();
        System.out.println(stack.pop() +" "+stack.isEmpty());
    }
}
