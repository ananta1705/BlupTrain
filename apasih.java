import java.util.Scanner;

public class apasih {
     public static void main(String[] args) {
        int pilihan;
        int nik = 0;
        String nama = "";
        String email = "";
        Scanner s = new Scanner(System.in);
        System.out.println("<<<<<<SELAMAT DATANG di BLUP TRAIN>>>>>>\n");
        System.out.print(" 1. create\n 2. read\n 3. update\n 4. delete\n");
        System.out.print("Pilih no berapa: ");
        pilihan = s.nextInt();
        s.nextLine(); // Membersihkan buffer setelah nextInt()
        clearScreen(); // Membersihkan layar setelah input data

        if (pilihan == 1) {
            // CREATE Ticket
            System.out.println("<<<<<<< REGISTRASI >>>>>>>>>>>");
            System.out.print("Nama: ");
            nama = s.nextLine();
            System.out.print("NIK: ");
            nik = s.nextInt();
            s.nextLine(); // Membersihkan buffer setelah nextInt()
            System.out.print("Email: ");
            email = s.nextLine();
            clearScreen();

            System.out.println("<<<<<< KATEGORI >>>>>>");
            System.out.print("Asal stasiun: ");
            String asal = s.nextLine();
            System.out.print("Tujuan stasiun: ");
            String tujuan = s.nextLine();
            clearScreen();

            System.out.println("------ Jadwal Keberangkatan ------");
            System.out.print("Masukkan tanggal (dd): ");
            int tanggal = s.nextInt();
            System.out.print("Masukkan bulan (mm): ");
            int bulan = s.nextInt();
            System.out.print("Masukkan tahun (yyyy): ");
            int tahun = s.nextInt();
            System.out.print("Jam keberangkatan:\n1. 08.00\n2. 12.00\n3. 16.00\nPilih nomor jam: ");
            int jam = s.nextInt();
            String jamKeberangkatan = switch (jam) {
                case 1 -> "08.00";
                case 2 -> "12.00";
                case 3 -> "16.00";
                default -> "Tidak Valid";
            };
            clearScreen();

            System.out.println("<<<<<<< KERETA DAN KURSI >>>>>>");
            System.out.print("Pilih kereta:\n1. Ekonomi\n2. Eksekutif\n3. Bisnis\nPilih nomor: ");
            int kereta = s.nextInt();
            String jenisKereta = switch (kereta) {
                case 1 -> "Ekonomi";
                case 2 -> "Eksekutif";
                case 3 -> "Bisnis";
                default -> "Tidak Valid";
            };
            clearScreen();

            System.out.print("Kursi yang tersedia:\n1. 1A\n2. 8D\n3. 9C\n4. 12B\nPilih nomor kursi: ");
            int kursi = s.nextInt();
            String nomorKursi = switch (kursi) {
                case 1 -> "1A";
                case 2 -> "8D";
                case 3 -> "9C";
                case 4 -> "12B";
                default -> "Tidak Valid";
            };
            clearScreen();

            System.out.println("<<<<<< ISI DATA PENUMPANG >>>>>>");
            System.out.print("Jumlah Dewasa: ");
            int dewasa = s.nextInt();
            System.out.print("Jumlah Bayi: ");
            int bayi = s.nextInt();
            clearScreen();

            System.out.println("<<<<<< PEMBAYARAN >>>>>>");
            System.out.print("Pembayaran menggunakan E-wallet:\n1. Dana\n2. Ovo\n3. LinkAja\n4. BlupTrainPay\n5. m-Banking\nPilih nomor pembayaran: ");
            int pembayaran = s.nextInt();
            String metodePembayaran = switch (pembayaran) {
                case 1 -> "Dana";
                case 2 -> "Ovo";
                case 3 -> "LinkAja";
                case 4 -> "BlupTrainPay";
                case 5 -> "m-Banking";
                default -> "Tidak Valid";
            };
            clearScreen();

            System.out.println("<<<<<< E-TICKET >>>>>>");
            System.out.println("Nama: " + nama);
            System.out.println("NIK: " + nik);
            System.out.println("Email: " + email);
            System.out.println("Asal Stasiun: " + asal);
            System.out.println("Tujuan Stasiun: " + tujuan);
            System.out.println("Tanggal Keberangkatan: " + tanggal + "/" + bulan + "/" + tahun);
            System.out.println("Jam Keberangkatan: " + jamKeberangkatan);
            System.out.println("Jenis Kereta: " + jenisKereta);
            System.out.println("Nomor Kursi: " + nomorKursi);
            System.out.println("Jumlah Dewasa: " + dewasa);
            System.out.println("Jumlah Bayi: " + bayi);
            System.out.println("Metode Pembayaran: " + metodePembayaran);
            System.out.println("E-Ticket Anda sudah dikirim ke email Anda.");
        } else if (pilihan == 2) {
            System.out.println("Fitur READ masih dalam pengembangan.");
        } else if (pilihan == 3) {
            System.out.println("Fitur UPDATE masih dalam pengembangan.");
        } else if (pilihan == 4) {
            System.out.println("Fitur DELETE masih dalam pengembangan.");
        } else {
            System.out.println("Pilihan tidak tersedia.");
        }
    }

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
