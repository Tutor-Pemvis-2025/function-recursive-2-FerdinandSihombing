// 12S25023 - Ferdinand Nicolas Sihombing

mport java.util.*;
import java.lang.Math;

public class TFUNC {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int angka, hasil;

        angka = input.nextInt();
        hasil = hitungRekursif(angka);
        System.out.println("Bilangan yang dimasukkan :" + angka);
        System.out.println("Hasil perhitungan rekursif :" + hasil);
    }
    
    public static int hitungRekursif(int angka) {
        int hasil;

        if (angka == 1) {
            hasil = 1;
        } else {
            hasil = angka + hitungRekursif(angka - 1);
        }
        
        return hasil;
    }
}
