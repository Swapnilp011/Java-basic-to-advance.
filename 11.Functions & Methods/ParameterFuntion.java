import java.util.*;
public class ParameterFuntion{
    public static void calsum(int num1, int num2){ //Parameter or formal parameter
        int sum=num1+num2;
        System.out.println("The sum is: "+sum);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        calsum(a,b); //Argument or actual paramater
        
    }
}