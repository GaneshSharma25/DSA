import StackPkg.Stack;
import StackPkg.StackLL;

public class App {

    public static void main(String[] args) {
        StackLL stackLL = new StackLL();
       
        System.out.println( stackLL.push(50));
        
        stackLL.push(95);
        stackLL.push(100);
        stackLL.display();
        System.out.println(stackLL.pop() +" "+stackLL.isEmpty());
    }
}
