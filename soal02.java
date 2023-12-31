import java.util.Scanner;

public class soal02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai N: ");
        int N = sc.nextInt();

        int jumlah = 0;
        int i = 2; // dimulai dari bilangan genap pertama

        do {
            jumlah += i;
            i += 2; // lanjut ke bilangan genap berikutnya
        } while (i <= N);

        System.out.println("Jumlah bilangan genap dari 1 hingga " + N + ": " + jumlah);
    }
}
