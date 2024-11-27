package statik;

import java.util.Scanner;

public class Q1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = 28;
        int b = 6;

        int hasil = (a * 3 - 36) % b;
        int jml = hasil+4;

        System.out.print("Masukkan nama kelompok : ");
        String nmKel = input.nextLine();
        System.out.println(a + " + " + b + " = " +jml);
        System.out.println("Hasil dari operasi " + jml + " adalah BENAR!");

    }
}
