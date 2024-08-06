public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        String str = "ganesh";
        String str1 = new String("ganesh");
        
        // if(str == str1){
            if(str.equals(str1)){
            System.out.println("Equal");
        }else{
            System.out.println("Not Equal");
        }
    }   
}
