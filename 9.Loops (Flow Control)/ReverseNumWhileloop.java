public class ReverseNumWhileloop{
    public static void main(String args[]){
        int num=12345;
        while(num>0){
            int lastdigit=num%10;
            System.out.print(lastdigit +"");

            num=num/10;
        }
    }
}