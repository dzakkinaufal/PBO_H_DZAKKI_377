//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class RekeningBank {
    // Atribut
    String nomorRekening; // Nomor rekening bank
    String namaPemilik; // Nama pemilik rekening
    double saldo; // Saldo rekening

    // Konstruktor
    public RekeningBank(String nomorRekening, String namaPemilik, double saldo) {
        this.nomorRekening = nomorRekening;
        this.namaPemilik = namaPemilik;
        this.saldo = saldo;
    }

    // Metode untuk menampilkan informasi rekening
    public void tampilkanInfo() {
        System.out.println("Nomor Rekening: " + nomorRekening);
        System.out.println("Nama Pemilik: " + namaPemilik);
        System.out.println("Saldo: Rp" + saldo);
        System.out.println();
    }

    // Metode untuk menyetor uang ke rekening
    public void setorUang(double jumlah) {
        if (jumlah > 0) { // Memastikan jumlah setor lebih dari 0
            saldo += jumlah; // Menambah saldo
            System.out.println(namaPemilik + " menyetor Rp" + jumlah + ". Saldo sekarang: Rp" + saldo);
        } else {
            System.out.println("Jumlah setor harus lebih dari 0.");
        }
    }

    // Metode untuk menarik uang dari rekening
    public void tarikUang(double jumlah) {
        if (jumlah > 0 && jumlah <= saldo) {
            saldo -= jumlah;
            System.out.println(namaPemilik + " menarik Rp" + jumlah + ". (Berhasil) Saldo sekarang: Rp" + saldo);
        } else if (jumlah > saldo) {
            System.out.println(namaPemilik + " menarik Rp" + jumlah + ". (Gagal, Saldo tidak mencukupi) Saldo saat ini: Rp" + saldo);
        } else {
            System.out.println("Jumlah tarik harus lebih dari 0.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // Membuat dua objek RekeningBank
        RekeningBank rekening1 = new RekeningBank("202310370311129", "Maharani", 500000);
        RekeningBank rekening2 = new RekeningBank("202310370311307", "Amelia", 1000000);

        // Menampilkan informasi rekening sebelum transaksi
        rekening1.tampilkanInfo();
        rekening2.tampilkanInfo();

        // Melakukan transaksi setor uang
        rekening1.setorUang(200000);
        rekening2.setorUang(500000);

        System.out.println(); // Baris kosong untuk pemisah

        // Melakukan transaksi tarik uang
        rekening1.tarikUang(800000); // Gagal karena saldo tidak mencukupi
        rekening2.tarikUang(300000); // Berhasil

        System.out.println(); // Baris kosong untuk pemisah

        // Menampilkan informasi rekening setelah transaksi
        rekening1.tampilkanInfo();
        rekening2.tampilkanInfo();
    }
}