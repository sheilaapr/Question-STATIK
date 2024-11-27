package statik;

import java.util.Scanner;

public class Q4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int p = 17;
        final int q = 4;

        int hasil1 = p * 3 - q * 2;
        int hasil2 = hasil1 % 5;
        int hasilAkhir = (hasil1 / hasil2) - 13;

        System.out.print("Masukkan nama kelompok : ");
        String nmKel = input.nextLine();
        System.out.println("Hasil akhir = " + hasilAkhir + " adalah BENAR!!!");
    }

}
