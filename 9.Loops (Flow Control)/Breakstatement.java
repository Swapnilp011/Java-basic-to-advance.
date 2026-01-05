public class Breakstatement{
    public static void main(String args[]){
        for (int i=0; i<=5; i++){
            System.out.println(i);
            if(i==3){
                break;
            }
        }
            System.out.println("Exit from the the loop");

    }
}