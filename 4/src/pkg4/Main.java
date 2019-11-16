/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg4;

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
        Scanner input = new Scanner(System.in);
        System.out.print("masukan jumlah kaos kaki = ");
        int jumlah = input.nextInt();
        int[] kaoskaki = new int[jumlah];
        for (int i = 0; i < kaoskaki.length; i++) {
            System.out.print("masukan kaos kaki ke " + (i + 1) + " : ");
            kaoskaki[i] = input.nextInt();
        }
        System.out.print("nama kaos kaki = ");
        for (int i = 0; i < kaoskaki.length; i++) {
            System.out.print(kaoskaki[i] + " ");
        }
        printRepeating(kaoskaki, jumlah);
    }

    public static void printRepeating(int arr[], int size) {
        int i, j;
        int a = 0;
        System.out.print("\nindeks kaos kaki yang sama:");
        for (i = 0; i < size; i++) {
            for (j = i + 1; j < size; j++) {
                if (arr[i] == arr[j]) {
                    System.out.print(arr[i] + " ");
                    a++;
                }
            }
        }
        System.out.println("\ntotal pasang kaos kaki : " + a);
    }

}
