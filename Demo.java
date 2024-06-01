import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Demo
{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        int L = scanner.nextInt();
        int R = scanner.nextInt();
        scanner.close();

        // Output the result
        System.out.println(countNearlyPrimes(L, R));
    }

    // Function to generate all primes up to n using the Sieve of Eratosthenes
    private static List<Integer> sieveOfEratosthenes(int n) {
        boolean[] isPrime = new boolean[n + 1];
        for (int i = 2; i <= n; i++) {
            isPrime[i] = true;
        }
        for (int p = 2; p * p <= n; p++) {
            if (isPrime[p]) {
                for (int i = p * p; i <= n; i += p) {
                    isPrime[i] = false;
                }
            }
        }
        List<Integer> primes = new ArrayList<>();
        for (int p = 2; p <= n; p++) {
            if (isPrime[p]) {
                primes.add(p);
            }
        }
        return primes;
    }

    // Function to count nearly primes between L and R
    private static int countNearlyPrimes(int L, int R) {
        int maxLimit = 1000000;
        List<Integer> primes = sieveOfEratosthenes((int) Math.sqrt(maxLimit));

        List<Integer> nearlyPrimes = new ArrayList<>();
        for (int prime : primes) {
            int nearlyPrime = prime * prime;
            if (nearlyPrime > maxLimit) {
                break;
            }
            nearlyPrimes.add(nearlyPrime);
        }

        int count = 0;
        for (int np : nearlyPrimes) {
            if (L < np && np < R) {
                count++;
            }
        }
        return count;
    }
}