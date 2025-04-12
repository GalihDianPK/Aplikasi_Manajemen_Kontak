import java.util.Scanner;
import java.util.ArrayList;

public class Aplikasi_Manajemen_Kontak {
    public static void main (String[] args) {
        System.out.println("=== Aplikasi manajemen Kontak ===");
        boolean status = true;

        while(status){
            String[] arrayMenu = {"Tambah kontak", "Cari kontak", "Hapus kontak", "Keluar"};
            for (int  i = 0; i < arrayMenu.length(); i++){
                System.out.println((i + 1) +". " + arrayMenu[i]);
            }

            System.out.print("PILIH MENU : ");
            byte pilihanMenu = -1; //? ini digunakan untuk menghindari error
            try {
                pilihanMenu = input.nextByte();
                input.nextLine();
            } catch (Exception e) {
                System.out.println("\nInput tidak valid masukkan angka antara (1-4)");
                input.nextLine();
                continue;
            }

            switch(pilihanMenu) {
                case 1 :

            }
        }
    }
}