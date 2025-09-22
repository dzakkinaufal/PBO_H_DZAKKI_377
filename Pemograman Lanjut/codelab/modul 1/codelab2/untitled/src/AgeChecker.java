import java.util.Scanner;

class AgeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan usia Anda: ");
        try {
            int age = scanner.nextInt();

            if (age <= 0 || age >= 120) {
                throw new InvalidAgeException("Usia " + age + " tidak valid. Harus antara 1 sampai 120.");
            }

            System.out.println("Usia Anda: " + age + " tahun");

        } catch (InvalidAgeException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Input tidak valid. Harap masukkan angka.");
        }

        scanner.close();
    }
}