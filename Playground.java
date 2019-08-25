public class Playground{
    public static void main(String[] args){
        gcd a=new gcd();
        System.out.println(a.findgcd(206,40));
    }
}

class expt{
    public int get(int b,int n){
        return this.fast_get(b,n,1);
    }
    int fast_get(int b,int n,int a){
        return n==0?a
                   :n%2==1?this.fast_get(b,n-1,a*b)
                          :this.fast_get(b*b,n/2,a);
    }
}

class times{
    public int multi(int a,int b){
        return fast_times(a,b,0);
    }
    int fast_times(int a,int b,int product){
        return b==0?product
                   :b%2==1?fast_times(a,b-1,product+a)
                          :fast_times(2*a,b/2,product);
    }
}

class gcd{
    public int findgcd(int n,int m){
        return m==0?n:this.findgcd(m,n%m);
    }
}