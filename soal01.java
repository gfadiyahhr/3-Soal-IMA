import java.util.Arrays;

public class soal01 {
    public static void main(String[] args) {
        int[] angka = new int[5];
        for (int i = 0; i < angka.length; i++) {
            angka[i] = (int) (Math.random() * 10) + 1;
        }
        System.out.println("Nilai integer dalam array: " + Arrays.toString(angka));
    }
}