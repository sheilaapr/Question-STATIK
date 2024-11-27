/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package statik;

/**
 *
 * @author Sheila
 */
import java.util.Scanner;

public class ba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("QUESTION 1 : Berapa hasil dari 28 dikurangi 8? ");
        double a = input.nextInt();

        System.out.print("QUESTION 2 : Berapa hasil dari 3 dikali 2? ");
        double b = input.nextInt();

        double hasil = a%b;
        
        System.out.println("CLUE adalah hasil akhir dari operasi diatas, yaitu : " + hasil);
        
         if (hasil == 2) {
            System.out.println("JAWABAN BENAR! Silakan menuju ke challenge berikutnya!!!");
        } else {
            System.out.println("JAWABAN SALAH! Silakan coba lagi;(");
        }
    }

}
