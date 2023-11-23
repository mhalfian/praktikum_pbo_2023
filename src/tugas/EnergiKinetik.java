package tugas;

public class EnergiKinetik {
    public static void main(String[] args) {
        // Masa bola baseball dalam kilogram (1 g = 0.001 kg)
        double massaBola = 0.145 / 1000; // 0.145 g
        
        // Kecepatan awal (dalam m/s)
        double kecepatanAwal = 0.0; // Bola dimulai dari keadaan diam
        
        // Kecepatan akhir (dalam m/s)
        double kecepatanAkhir = 25.0;
        
        // Menghitung energi kinetik
        double energiKinetik = 0.5 * massaBola * Math.pow(kecepatanAkhir, 2);
        
        System.out.println("a. Energi Kinetik bola baseball: " + energiKinetik + " joule");
        
        // Menghitung usaha
        double usaha = energiKinetik - (0.5 * massaBola * Math.pow(kecepatanAwal, 2));
        
        System.out.println("b. Usaha yang dilakukan pada bola: " + usaha + " joule");
    }
}
