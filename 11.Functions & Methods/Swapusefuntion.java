public class Swapusefuntion{
    public static void Swapab(int a, int b){
        int temp=a;
        a=b;
        b=temp;

        System.out.println("A value is: "+a);
        System.out.println("B value is: "+b);
    }
    public static void main(String args[]){
        int a=10;
        int b=20;
        //swap it
        Swapab(a, b);
    }
}