public class OverloadingFunction{

    public static int sum(int a, int b){
        return a+b;
    }
    public static int sum(int a, int b, int c){
        return a+b+c;
    }

    public static void main(String arhs[]){
        System.out.println(sum(5, 10));
        
        System.out.println(sum(5, 10, 15));
    }
}