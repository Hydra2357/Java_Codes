package JavaByCoderArmy;

public class Primenumbers {

    public static boolean isPrime(int n) {
        if(n <= 1) return false;
        if(n == 2) return true;
        if(n % 2 ==0) return false;

        for(int i = 3; i * i <=n; i+=2) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int limit = 200;
        System.out.println("Prime no up to" + limit + ":");

        for(int num = 2; num <= limit; num++) {
            if(isPrime(num)) {
                System.out.print(num + " ");
            }
        }
    }
}
