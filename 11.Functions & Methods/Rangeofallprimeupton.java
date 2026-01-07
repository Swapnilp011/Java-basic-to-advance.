public class Rangeofallprimeupton{

    public static boolean isprime(int n){
        boolean isprime=true;
        for(int i=2; i<=n-1; i++){
            if(n%i==0){
                isprime=false;
            }
        }
        return isprime;
    }

        public static void checkrange(int n){
            for(int i=2; i<=n; i++){
                if(isprime(i))
                    {
                System.err.print(i+ " ");
                }

            }
            System.out.println();
        }

    public static void main (String args[]){
        checkrange(20);        
    }
}