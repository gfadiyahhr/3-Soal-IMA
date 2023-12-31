import java.util.Scanner;

public class soal03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Masukkan nilai n untuk deret Fibonacci: ");
        int n = scan.nextInt();

        if (n < 0) {
            System.out.println("Deret Fibonacci tidak dapat dihitung untuk nilai negatif.");
        } else {
            System.out.println("Deret Fibonacci hingga suku ke-" + n + " adalah: " + hitungFibonacci(n));
        }
    }

    private static int hitungFibonacci(int n) {
        if (n == 0) {
            return 0; //basis: F(0) = 0
        } else if (n == 1) {
            return 1; //basis: F(1) = 1
        } else {
            return hitungFibonacci(n - 1) + hitungFibonacci(n - 2); // rekursif: F(n)= F(n-1) + F(n-2)
        }
    }
}
