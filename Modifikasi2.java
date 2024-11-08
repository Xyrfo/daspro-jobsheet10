import java.util.Scanner;

public class Modifikasi2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int baris, kolom;
        String nama;
        String[][] penonton = new String[4][2];

        int menuChoice;
        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu (1/2/3): ");
            menuChoice = sc.nextInt();
            sc.nextLine(); 

            if (menuChoice == 1) {
                System.out.print("Masukkan nama: ");
                nama = sc.nextLine();
                System.out.print("Masukkan baris: ");
                baris = sc.nextInt();
                System.out.print("Masukkan kolom: ");
                kolom = sc.nextInt();
                sc.nextLine(); 

                if (isValidSeat(baris, kolom, penonton)) {
                    if (penonton[baris - 1][kolom - 1] == null) {
                        penonton[baris - 1][kolom - 1] = nama;
                    } else {
                        System.out.println("Maaf, kursi sudah terisi oleh penonton lain.");
                    }
                } else {
                    System.out.println("Nomor baris atau kolom kursi tidak tersedia.");
                }
            } else if (menuChoice == 2) {
                tampilkanPenonton(penonton);
            } else if (menuChoice == 3) {
                System.out.println("Terima kasih! Program berakhir.");
                break;
            } else {
                System.out.println("Pilihan tidak valid. Silakan pilih lagi.");
            }
        }
    }

    public static void tampilkanPenonton(String[][] penonton) {
        System.out.println("Daftar penonton:");
        for (int i = 0; i < penonton.length; i++) {
            for (int j = 0; j < penonton[i].length; j++) {
                if (penonton[i][j] != null) {
                    System.out.println("Baris ke-" + (i + 1) + ", Kolom ke-" + (j + 1) + ": " + penonton[i][j]);
                }  else {
                    System.out.println("Baris ke-" + (i + 1) + ", Kolom ke-" + (j + 1) + ": ***");
                }
            }
        }
    }

    public static boolean isValidSeat(int baris, int kolom, String[][] penonton) {
        return baris >= 1 && baris <= penonton.length && kolom >= 1 && kolom <= penonton[0].length;
    }
}
