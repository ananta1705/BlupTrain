import java.util.Scanner;
public class tiket {
    public static void main(String[] args) {
        int pilihan;
        int nik = 0;
        String nama = "";
        String email = "";
        Scanner s = new Scanner (System.in);
        System.out.println("<<<<<<SELAMAT DATANG di BLUP TRAIN>>>>>>\n");
        System.out.print(" 1. create\n 2. read\n 3. update\n 4. delete\n");
        System.out.print("Pilih no berapa: ");
        pilihan = s.nextInt();
        s.nextLine();// Membersihkan buffer setelah nextInt()
        clearScreen(); // Membersihkan layar setelah input data
        if (pilihan == 1){
            System.out.println("<<<<<<< REGISTRASI >>>>>>>>>>>");
            System.out.print("Nama: ");
            nama = s.nextLine();
            System.out.print("NIK: ");
            nik = s.nextInt();
            s.nextLine(); // Membersihkan buffer setelah nextInt()
            System.out.print("Email: ");
            email = s.nextLine();
            clearScreen(); // Membersihkan layar setelah input data
            System.out.println("<<<<<< KATEGORI >>>>>>");
            System.out.print("Asal stasiun: ");
            String asal = s.nextLine();
            System.out.print("Tujuan stasiun: ");
            String tujuan = s.nextLine();
            clearScreen(); // Membersihkan layar setelah input data
            System.out.println("------ Jadwal Keberangkatan ------");
            System.out.print("Masukkan tanggal: ");
            int tanggal = s.nextInt();
            System.out.print("Masukkan bulan (huruf): ");
            int bulan = s.nextInt();
            System.out.print("Masukkan tahun: ");
            int tahun = s.nextInt();
            System.out.print("jam keberangkatan:\n1. 08.00\n2. 12.00\n3. 16.00\njam berapa:  ");
            int jam = s.nextInt();
            clearScreen();
            System.out.println("<<<<<<< KERETA DAN KURSI >>>>>>");
            System.out.print("Pilih kereta:\n1. Ekonomi\n2. eksekutive\n3. bisnis\npilih nomor berapa: ");
            int kereta = s.nextInt();
            clearScreen();
            System.out.print("kursi yang tersedia:\n1. 1A\n2. 8D\n3. 9C\n4. 12B\n pilih omor berapa: ");
            int kursi = s.nextInt();
            clearScreen();
            System.out.println("<<<<<< ISI DATA PENUMPANG >>>>>>");
            System.out.print("Dewasa: ");
            int dewasa = s.nextInt();
            System.out.print("Bayi: ");
            int bayi = s.nextInt();
            System.out.println("<<<<<< PEMBAYARAN >>>>>>");
            System.out.print("pembayaran menggunakan E-wallet\n1. Dana\n2. Ovo\n3. Linkaja\n4. BlupTrainpay\n5. m-banking\npilih apa (inputkan nomornya): ");
            int pembayaran = s.nextInt();
            clearScreen();
            System.out.println("<<<<<< E-TICKET >>>>>>");
            System.out.print("E-Ticket anda sudah dikirim ke Email anda");
        }else if (pilihan == 2){

        }else if (pilihan == 3){

        }else if (pilihan == 4){

        }else{
            System.out.println("pilihan tidak tersedia");
        }
    
    }public static void clearScreen() {
        System.out.print("\033[H\033[2J"); // Escape sequence ANSI untuk membersihkan layar
        System.out.flush();
    }
}
