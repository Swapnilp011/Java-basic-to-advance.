import java.util.*;
public class Checkevenorodduserinput{
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int number=sc.nextInt();
    if(number%2==0){
        System.out.println("this is Even");
    }
    else{
        System.out.println("this is Odd");
    }
}
}