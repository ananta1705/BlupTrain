import java.util.Scanner;
public class coba {
    public static void main(String[] args) {
        int pilihan, nik = 0;
        String nama = "", email = "";
        Scanner s = new Scanner(System.in);

        System.out.println("<<<<<<SELAMAT DATANG >>>>>>\n");
        System.out.print(" 1. create\n 2. read\n 3. update\n 4. delete\n");
        System.out.print("Pilih no berapa: ");
        pilihan = s.nextInt();
        s.nextLine(); // Membersihkan buffer setelah nextInt()

        clearScreen(); // Membersihkan layar sebelum memulai fitur

        if (pilihan == 1) {
            System.out.println("<<<<<<<Registrasi>>>>>>>>>>>");
            System.out.print("Nama: ");
            nama = s.nextLine();

            System.out.print("NIK: ");
            nik = s.nextInt();
            s.nextLine(); // Membersihkan buffer setelah nextInt()

            System.out.print("Email: ");
            email = s.nextLine();

            clearScreen(); // Membersihkan layar setelah input data

            System.out.println("Data yang telah dimasukkan:");
            System.out.println("Nama: " + nama);
            System.out.println("NIK: " + nik);
            System.out.println("Email: " + email);

            // Melanjutkan ke input berikutnya
            System.out.println("\nSilakan pilih menu lainnya.");
        } else if (pilihan == 2) {
            System.out.println("Fitur READ belum diimplementasikan.");
        } else if (pilihan == 3) {
            System.out.println("Fitur UPDATE belum diimplementasikan.");
        } else if (pilihan == 4) {
            System.out.println("Fitur DELETE belum diimplementasikan.");
        } else {
            System.out.println("Pilihan tidak tersedia.");
        }

        s.close(); // Menutup Scanner
    }

    // Fungsi untuk membersihkan layar
    public static void clearScreen() {
        System.out.print("\033[H\033[2J"); // Escape sequence ANSI untuk membersihkan layar
        System.out.flush();
    }
}


