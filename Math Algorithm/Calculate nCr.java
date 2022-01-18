
// Calculate nCr 
class Main{
    public static long GCD(long n1,long n2){
        if (n1==0)
            return n2;
        return GCD(n2,n1%n2);
    }
    public static void main(String[] args) {
        int n = 10,r = 5;
        if (n-r < r){
            r = n-r;
        }
        long divisor = 1,divident=1;
        while (r>0){
            divisor *= n--;
            divident *= r--;
            long gcdval = GCD(divisor,divident);
            divisor /= gcdval;
            divident /= gcdval;
        }
        System.out.println(divisor/divident);
    }
}
