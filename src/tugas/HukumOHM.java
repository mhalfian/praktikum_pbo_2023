package tugas;

public class HukumOHM {
    public static void main(String[] args){
        System.out.println("=====Hukum OHM=====");
        System.out.println("Kuat arus yang mengalir pada suatu kawat penghantar akan berbanding lurus dengan beda potensial pada ujung-ujung kawat penghantar tersebut asalkan suhu kawat dijaga konstan.\n");

        Baterai baterai1 = new Baterai();
        Baterai baterai2 = new Baterai(3.0f, 12.0f);

        System.out.println("Kuat Arus: " + baterai2.getKuatArus() + " ampere");
        System.out.println("Hambatan: "+ baterai2.getHambatan() + " ohm" );
        System.out.println("Hasil Tegangan: "+ baterai2.hitungTegangan() + " volt");
    }
}
class Baterai{
    private float kuatArus;
    private float hambatan;

    public Baterai(){
        this.kuatArus = 0.0f;
        this.hambatan = 0.0f;
    }

    public Baterai(float kuatArus, float hambatan){
        this.kuatArus = kuatArus;
        this.hambatan = hambatan;
    }
     
    public float getKuatArus(){
        return kuatArus;
    }

    public float getHambatan(){
        return hambatan;
    }

    public float hitungTegangan(){
        return kuatArus * hambatan;
    }
}