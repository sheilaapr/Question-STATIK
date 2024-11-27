package statik;

import java.util.Scanner;
public class Q5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double p = 12;
        double l = 8;
        double t = 3;

        double luas = p * l * t;
        double hasil = (luas % 5) *t +9;

        System.out.print("Masukkan nama kelompok : ");
        String nmKel = input.nextLine();
        System.out.println("Hasil akhir = " + hasil + " adalah BENAR!!!");
    }

}
