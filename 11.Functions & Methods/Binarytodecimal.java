public class Binarytodecimal{

    public static void Mynum(int binarynum){
        int number=binarynum;
        int pow=0;
        int decnum=0;

        while(binarynum>0){
            int lastdigit=binarynum%10;
            decnum=decnum+(lastdigit*(int)Math.pow(2, pow));
            pow++;
            binarynum=binarynum/10;

        }
        System.out.println("Decimal of "+ number +" = "+ decnum);
        
    }

    public static void main (String args[]){
        Mynum(10001);
    }
}