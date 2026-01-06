public class Binomialcoefficient{
    public static int fact(int n){
        int f=1;
        for(int i=1; i<=n; i++){
            f=f*i;

        }
        return f;
    }
    public static int Bicoeffi(int n, int r){
        int fact_a=fact(n);
        int fact_b=fact(r);
        int fact_c=fact(n-r);

        int ans= fact_a/(fact_b*fact_c);
        return ans;

    }
    public static void main(String[] args) {
        System.out.println(Bicoeffi(5, 2));
    }
}