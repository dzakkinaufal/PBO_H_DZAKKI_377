import java.util.Scanner;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta input dari pengguna
        System.out.print("Masukkan nama: ");
        String nama = scanner.nextLine();

        System.out.print("Masukkan jenis kelamin (P/L): ");
        char jenisKelamin = scanner.next().charAt(0);

        System.out.print("Masukkan tahun lahir: ");
        int tahunLahir = scanner.nextInt();

        // Menutup Scanner
        scanner.close();

        // Menghitung umur pengguna
        int tahunSekarang = LocalDate.now().getYear();
        int umur = tahunSekarang - tahunLahir;

        // Menentukan jenis kelamin
        String jenisKelaminTeks = (jenisKelamin == 'L' || jenisKelamin == 'l') ? "Laki-Laki" :
                (jenisKelamin == 'P' || jenisKelamin == 'p') ? "Perempuan" : "Tidak Valid";

        // Menampilkan output
        System.out.println("\nData Diri:");
        System.out.println("Nama          : " + nama);
        System.out.println("Jenis Kelamin : " + jenisKelaminTeks);
        System.out.println("Umur         : " + umur + " tahun");
    }
}