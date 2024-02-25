import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan nama: ");
        String nama = scanner.nextLine();

        System.out.println("Masukkan jenis kelamin (P/L): ");
        String jenisKelaminInput = scanner.nextLine();
        String jenisKelamin = (jenisKelaminInput.equalsIgnoreCase("P")) ? "Perempuan" : "Laki-laki";

        System.out.println("Masukkan tanggal lahir (YYYY-MM-DD): ");
        String tanggalLahirInput = scanner.nextLine();
        LocalDate tanggalLahir = LocalDate.parse(tanggalLahirInput);

        // Menghitung umur
        LocalDate sekarang = LocalDate.now();
        Period usia = Period.between(tanggalLahir, sekarang);

        System.out.println("\n===== Data Diri =====");
        System.out.println("Nama: " + nama);
        System.out.println("Jenis Kelamin: " + jenisKelamin);
        System.out.println("Tanggal Lahir: " + tanggalLahir);
        System.out.println("Umur: " + usia.getYears() + " tahun " + usia.getMonths() + " bulan " + usia.getDays() + " hari");

        scanner.close();
    }
}


