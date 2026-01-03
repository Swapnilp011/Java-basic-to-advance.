import java.util.*;
public class Printnnumusewhileloop{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        int a=1;
        while(a<=number){
            System.out.println(a);
            a++;
        }
        System.out.println("printing completed from 1 to "+number);
        
    }
}