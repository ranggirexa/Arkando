/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3;

import java.util.Scanner;

/**
 *
 * @author ranggirexa
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    static int wordcount(String string) {
        int count = 0;
        char ch[] = new char[string.length()];
        for (int i = 0; i < string.length(); i++) {
            ch[i] = string.charAt(i);

            if (ch[i] >= '0' && ch[i] <= '9') {
                count++;
            }
        }
        return count;
    }

    static int hitungkalimat(String string) {
        int huruf = 0;
        int a = 0;
        char ch[] = new char[string.length()];
        for (int i = 0; i < string.length(); i++) {
            ch[i] = string.charAt(i);
            if (((i > 0) && (ch[i] != ' ') && (ch[i - 1] == ' ')) || ((ch[0] != ' ') && (i == 0))) {
                huruf++;
                if (ch[i] >= '0' && ch[i] <= '9') {
                    a++;
                }
            }
        }
        huruf = huruf - a;
        return huruf;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan kalimat : ");
        String kalimat = input.nextLine();
        System.out.println(hitungkalimat(kalimat) + " kata & " + wordcount(kalimat) + " angka .");
    }
}
