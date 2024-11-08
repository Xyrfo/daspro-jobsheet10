import java.util.Scanner;
public class SIAKAD26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukan jumlah Mahasiswa : ");
        int jumlahMahasiswa = sc.nextInt();
        System.out.print("Masukan jumlah Mata Kuliah : ");
        int jumlahMataKuliah = sc.nextInt();

        int[][] nilai = new int[jumlahMahasiswa][jumlahMataKuliah];

        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Input nilai mahasiswa ke-" + (i + 1));
            double totalPersiswa = 0;

            for (int j = 0; j < nilai[i].length; j++) {
                System.out.print("Nilai mata kuliah " + (j+1) + ": ");
                nilai[i][j] = sc.nextInt();
                totalPersiswa += nilai[i][j];
            }

            System.out.println("Nilai rata-rata: " + totalPersiswa/jumlahMataKuliah);
        }
        System.out.println("\n====================================");
        System.out.println("Rata-rata Nilai setiap Mata Kuliah:");

        for (int j = 0; j < jumlahMahasiswa; j++) {
            double totalPersiswa = 0;

            for (int i = 0; i < jumlahMataKuliah; i++) {
                totalPersiswa += nilai[i][j];
            }

            System.out.println("Mata Kuliah " + (j + 1) + ": " + totalPersiswa/jumlahMahasiswa);
        }
    }
}