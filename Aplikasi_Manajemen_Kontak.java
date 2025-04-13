import java.util.Scanner;
import java.util.ArrayList;

public class Aplikasi_Manajemen_Kontak {

    public static void delay() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== Aplikasi manajemen Kontak ===");
        boolean status = true;

        while(status){
            String[] arrayMenu = {"Tambah kontak", "Cari kontak", "Hapus kontak", "Keluar"};
            for (int  i = 0; i < arrayMenu.length; i++){
                System.out.println((i + 1) +". " + arrayMenu[i]);
            }

            System.out.print("PILIH MENU : "); //! kode mengoperasikan pilihan menu
            byte pilihanMenu = -1; //? ini digunakan untuk menghindari error

            try {
                pilihanMenu = input.nextByte();
                input.nextLine();
            } catch (Exception e) {
                for(int i = 0; i < 3; i++){
                    System.out.print(".");
                    delay();
                }
                System.out.println("\nInput tidak valid masukkan angka antara (1-4)");
                input.nextLine();
                continue;
            }

            switch(pilihanMenu) {
                case 1 :
                    for(int i = 0; i < 3; i++){
                        System.out.print(".");
                        delay();
                    }
                    break;
                default :
                    System.out.println("Pilihan sistem tidak tersedia, silahkan pilih (1-4)");
                    status = true;
                    break;
            }
        }
        //! kode untuk logout aplikasi
        System.out.println("Apakah kamu ingin keluar aplikasi? (y/n) : ");
        char keluarAplikasi = input.next().charAt(0);
        input.nextLine();

        if(keluarAplikasi == 'y' || keluarAplikasi == 'Y') {
            System.out.println("Terimakasih sudah menggunakan aplikasi !");
        } else if (keluarAplikasi == 'n' || keluarAplikasi == 'N') {
            status = true;
        } else {
            System.out.println("Input tidak valid silahkan masukkan (y/n) ! :");
            keluarAplikasi = input.next().charAt(0);
        }   
    }
}
