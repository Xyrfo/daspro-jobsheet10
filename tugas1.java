import java.util.Scanner;

public class tugas1 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int[][] surveyData = new int[10][6];

    for (int i = 0; i < surveyData.length; i++) {
        System.out.println("Responden " + (i + 1));
        for (int j = 0; j < surveyData[i].length; j++){
            while (true) {
                System.out.print("NIlai untuk pertanyaan " + (j + 1) + "(1-5): ");
                surveyData[i][j] = sc.nextInt();
                if (surveyData[i][j] >= 1 && surveyData[i][j] <= 5) {
                    break;
                } else {
                    System.out.println("Input Tidak Valid");
                }
            }
        }
    }
    System.out.println("\n===========================================:");
    System.out.println("Rata-rata nilai untuk setiap responden: ");
    for (int i = 0; i < surveyData.length; i++ ) {
        double total = 0;
        for (int j = 0; j < surveyData[i].length; j++) {
            total += surveyData[i][j];
        }
        double rataRataResponden = total / surveyData[i].length;
        System.out.println("Responden " + (i + 1) + ": " + rataRataResponden);
    }
    System.out.println("\n==========================================:");
    System.out.println("\nRata-rata nilai untuk setiap pertanyaan: ");
    for (int j = 0; j < surveyData[0].length; j++) {
        double total = 0;
        for (int i = 0; i < surveyData.length; i++) {
            total += surveyData[i][j];
        }
        double rataRataPertanyaan = total / surveyData.length;
        System.out.println("Pertanyaan " + (j + 1) + ": " + rataRataPertanyaan);
    }
    double totalKeselurahan = 0;
    for (int i = 0; i < surveyData.length; i++) {
        for (int j = 0; j < surveyData[i].length; j++) {
            totalKeselurahan += surveyData[i][j];
        }
    }
    double rataRataKeseluruhan = totalKeselurahan/(surveyData.length*surveyData[0].length);
    System.out.println("====================================");
    System.out.println("\nRata-rata nilai keseluruhan: " + rataRataKeseluruhan);

    sc.close();
    }
}