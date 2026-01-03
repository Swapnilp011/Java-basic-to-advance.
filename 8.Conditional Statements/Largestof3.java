public class Largestof3{
    public static void main(String args[]){
        int a=1;
        int b=3;
        int c=6;
        if(a>b && a>c){
            System.out.println("A is the largest number");
        }
        else if(b>a && b>c){
            System.out.println("B is the largest number");
        }
        else {
            System.out.println("C is the largest number");
        }
    }
}