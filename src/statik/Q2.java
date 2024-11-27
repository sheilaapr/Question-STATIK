package statik;

import java.util.Scanner;

public class Q2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = 28;
        int b = 6;

        int hasil1 = (a * 3 - b) % 5;
        int hasil2 = (hasil1 + 7) / 2;
        int hasilAkhir = hasil2 - 4;

        System.out.print("Masukkan nama kelompok : ");
        String nmKel = input.nextLine();
        System.out.println("Hasil Akhir : " + hasilAkhir + " adalah BENAR!!!");

    }

}
