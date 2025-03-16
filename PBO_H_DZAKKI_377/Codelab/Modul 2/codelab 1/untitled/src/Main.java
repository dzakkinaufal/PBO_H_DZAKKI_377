//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class Hewan {
    // Deklarasi atribut untuk menyimpan nama, jenis, dan suara
    String nama;
    String jenis;
    String suara;

    // Konstruktor untuk menginisialisasi atribut saat objek dibuat
    public Hewan(String nama, String jenis, String suara) {
        this.nama = nama; // Menyimpan nilai nama
        this.jenis = jenis; // Menyimpan nilai jenis
        this.suara = suara; // Menyimpan nilai jenis
    }

    // Metode untuk menampilkan informasi hewan
    public void tampilkanInfo() {
        System.out.println("Nama: " + nama); // Menampilkan nama hewan
        System.out.println("Jenis: " + jenis); // Menampilkan jenis hewan
        System.out.println("Suara: " + suara); // Menamoilkan suara hewan
        System.out.println(); // Baris kosong untuk pemisah output
    }
}

public class Main {
    public static void main(String[] args) {
        // Membuat objek Hewan
        Hewan hewan1 = new Hewan("Kucing", "Mamalia", "Nyann~~");
        Hewan hewan2 = new Hewan("Anjing", "Mamalia", "Woof-Woof!!");

        // Menampilkan informasi hewan
        hewan1.tampilkanInfo();
        hewan2.tampilkanInfo();
    }
}