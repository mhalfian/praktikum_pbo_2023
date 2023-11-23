package tugas;
import java.util.Scanner;

public class NilaiMahasiswa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("QUIZ = ");
        double QUIZ = input.nextDouble();
        System.out.print("UTS = ");
        double UTS = input.nextDouble();
        System.out.print("UAS = ");
        double UAS = input.nextDouble();

        
        double NA = (0.20 * QUIZ) + (0.30 * UTS) + (0.50 * UAS);

        char Index;
        if (NA >= 80) {
            Index = 'A';
        } else if (NA >= 68) {
            Index = 'B';
        } else if (NA >= 56) {
            Index = 'C';
        } else if (NA >= 45) {
            Index = 'D';
        } else {
            Index = 'E';
        }

        String Keterangan;
        switch (Index) {
            case 'A':
                Keterangan = "Sangat Baik";
                break;
            case 'B':
                Keterangan = "Baik";
                break;
            case 'C':
                Keterangan = "Cukup";
                break;
            case 'D':
                Keterangan = "Kurang";
                break;
            default:
                Keterangan = "Sangat Kurang";
                break;
        }
        
        System.out.println("\nNilai Akhir\t= " + NA);
        System.out.println("\nIndex = " + Index);
        System.out.println("Keterangan = " + Keterangan);

        input.close();
    }
}
