public class Primes {
    public static void main(String[] args) {
        PrintPrimes(100);
    }

    public static void PrintPrimes(int n) {
        boolean[] f = new boolean[n];
        for (int i = 0; i < n; i++) f[i] = true;
        f[0] = false;
        f[1] = false;
        for (int i = 2; i < n; i++) {
            if (!f[i]) continue;
            for (int j = i * i; j < n; j = j + i) {
                f[j] = false;
            }
        }
        for (int i = 2; i < n; i++) if (f[i]) System.out.println(i);
    }
}
