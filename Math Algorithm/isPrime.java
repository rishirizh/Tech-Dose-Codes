// prime or not
class Main{
    public static void main(String[] args) {
        int n=11;
        for(int i=2;i<=Math.sqrt(n);i++){
            if (n%i==0){
                System.out.println("Not a prime");
                return;
            }
        }
        System.out.println("It is a prime");
    }
}
