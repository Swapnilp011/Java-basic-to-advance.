import java.util.*;
public class Primenumber{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        int num=sc.nextInt();
        boolean isprime=true;
        for (int i=2; i<=num-1; i++){
            if(num%i==0){
                isprime=false;
            }
        }
            if(isprime==true){
                System.out.println("The number is Prime");
            }
            else{
                System.out.println("The number is not Prime");
            }
        
    }
}