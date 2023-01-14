public class Main {
    public static void main(String[] args) {
        System.out.println("gcd -> " + gcd(7,11));
    }

    //extended euclidean algorithm
    public static int gcd(int a, int b){
        if(a == 0) {
            return b;
        }
        return gcd(b%a,a);
    }
}