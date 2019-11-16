/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2;

import java.util.Scanner;

/**
 *
 * @author ranggirexa
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String username;
        String password;
        Scanner input = new Scanner(System.in);
        System.out.println("Format Username: harus tepat 7 huruf dan harus huruf besar semuanya");
        System.out.println("Format Password: merupakan kombinasi dari 3 digit angka berulang, simbol “*” lalu 3 huruf berulang. ");
        System.out.println("===============================");

        System.out.print("Username : ");
        username = input.next();
        if (username.matches(".*[a-z].*") || username.length() != 7) {
            System.out.println("GUNAKAN HURUF KAPITAL UNTUK KESELURUHAN dan HURUF HARUS TEPAT 7");
        } else {
            System.out.print("Password : ");
            password = input.next();
            if (password.length() == 7) {
                char[] huruf = new char[7];
                huruf[0] = password.charAt(0);
                huruf[1] = password.charAt(1);
                huruf[2] = password.charAt(2);
                huruf[3] = password.charAt(3);
                huruf[4] = password.charAt(4);
                huruf[5] = password.charAt(5);
                huruf[6] = password.charAt(6);

                for (int i = 0; i < 2; i++) {
                    if (huruf[i] >= '0' && huruf[i] <= '9') {
                    } else {
                        System.out.println("gunakan angka");
                    }
                }
                if (huruf[0] != huruf[1] && huruf[1] != huruf[2]) {
                    System.out.println("GUNAKAN 3 ANGKA YANG SAMA CONTOH, 111");
                } else if (huruf[3] != '*') {
                    System.out.println("Huruf ke empat menggunakan simbol *");
                }
                for (int i = 4; i < 7; i++) {
                    if (huruf[i] >= 'a' && huruf[i] <= 'z' || huruf[i] >= 'A' && huruf[i] <= 'Z') {
                    } else {
                        System.out.println("gunakan alfabet untuk 3 huruf terakhir");
                    }
                }
                if (huruf[4] != huruf[5] && huruf[5] != huruf[6]) {
                    System.out.println("SETELAH SIMBOL GUNAKAN 3 HURUF YANG SAMA CONTOH, AAA");
                }

            } else {
                System.out.println("JUMLAH HARUS TEPAT 7");
            }

        }
//        System.out.println("=====================");
//        System.out.println("username = "+username);
//        System.out.println("password = "+password);
    }
}
