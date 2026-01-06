public class Findfactorial{
    public static int fact(int n){
         int f=1;
        for(int i=1; i<=n; i++){
           
            f=f*i;
        }
        return f;

    }
    
//     public static void main(String args[]){
//         int Ans=fact(5);
//         System.out.println("Factorial of 5 is: "+Ans);
//     }
// }

 public static void main(String args[]){
        System.out.println("Factorial of 5 is: "+fact(5));
        
    }

}