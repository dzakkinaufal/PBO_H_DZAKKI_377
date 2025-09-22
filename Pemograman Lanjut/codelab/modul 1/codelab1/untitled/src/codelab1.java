import java.util.ArrayList;

public class codelab1 {
    public static void main(String[] args) {
        String[] nama = {"Adi", "Budi", "Cahyo", "Diana", "Eva"};
        ArrayList<String> namaTerpanjang = cariNamaTerpanjang(nama);

        System.out.println("Nama terpanjang adalah: " + String.join(", ", namaTerpanjang));
    }

    public static ArrayList<String> cariNamaTerpanjang(String[] array) {
        ArrayList<String> namaMaxList = new ArrayList<>();
        int maxLength = 0;

        for (String nama : array) {
            if (nama.length() > maxLength) {
                namaMaxList.clear();
                namaMaxList.add(nama);
                maxLength = nama.length();
            } else if (nama.length() == maxLength) {

                namaMaxList.add(nama);
            }
        }

        return namaMaxList;
    }
}