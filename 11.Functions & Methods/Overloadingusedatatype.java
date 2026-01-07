public class Overloadingusedatatype{

    public static int sum(int a, int b){
        return a+b;
    }
    public static float sum(float  a, float b, float c){
        return a+b+c;
    }

    public static void main(String args[]){
        System.out.println(sum(5, 10));
        
        System.out.println(sum(5.5f, 10.5f, 14.0f));
    }
}