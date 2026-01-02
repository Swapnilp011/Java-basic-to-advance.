public class Elseifcheck{
    public static void main(String args[]){
        int age=15;
        if(age<13){
            System.out.println("It is children");
        }
        else if(age>13 && age<18){
            System.out.println("It is teeanager");
        }
        else{
            System.out.println("It is adult");
        }
    }
}