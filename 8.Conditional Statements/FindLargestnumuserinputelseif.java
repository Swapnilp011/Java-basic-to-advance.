import java.util.*;
public class FindLargestnumuserinputelseif{
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter 1st number: ");
        int a =sc.nextInt();
        System.out.println("Enter 2nd number: ");
        int b=sc.nextInt();
        System.out.println("Enter 3rd number: ");
        int c=sc.nextInt();
        if(a>b && a>c){
            System.out.println("largest number is :"+ a);
        }
        else if(b>c && b>a){
            System.out.println("Largest number is: "+b);
        }
        else{
            System.out.println("largest number is:"+c);
        }
    }
}