package statik;

import java.util.Scanner;

public class Q3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double jariJari = 5;
        double phi = 22.0 / 7;

        double keliling = 2 * phi * jariJari;
        int sisa = (int) (keliling % 5);
        int hasil = sisa + 15;

        System.out.print("Masukkan nama kelompok : ");
        String nmKel = input.nextLine();
        System.out.println("Hasil akhir = " + hasil + " adalah BENAR!!!");
    }

}
