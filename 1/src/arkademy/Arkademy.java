/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arkademy;

/**
 *
 * @author ranggirexa
 */
public class Arkademy {
//    private String nama;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        biodata();

    }

    public static void biodata() {
        String nama = "ranggi rexa vigor santoso";
        Number age = 22;
        String addres = "jln kaca piring 3 blok 4 nomor 110 jember";
        String[] hobbies = {"traveling ", "musik "};
        boolean is_married = false;
        String[][] list_school = {
            {"name = ", "SDN Jember Kidul 4 ", " SMPN 1 Jember ", " SMAN 4 Jember ", " Universitas Jember"},
            {"year_in = ", "2003 ", " 2009 ", " 2012 ", " 2015 "},
            {"year_out = ", "2009 ", " 2012", " 2015 ", " 2009 "},
            {"major = ", null, null, null, "Sistem Informasi"}
        };
        String[][] Skill = {
            {"skill name =", " Java ", " Phyton ", " HTML ", " Database ", " SQL "},
            {"Skill level =", " Advance ", " Advance ", " Advance ", " Advance ", " Advance"}
        };
        boolean interest_in_coding = true;

        System.out.println("nama : " + nama + "\n" + "umur : " + age + "\n" + "alamat : " + addres);
        System.out.print("hobi ");
        for (int i = 0; i < hobbies.length; i++) {
            System.out.print(hobbies[i]);
        }
        System.out.println("\nriwayat sekolah : ");

        for (int i = 0; i < list_school.length; i++) {
            System.out.println(list_school[i][0] + " " + list_school[i][1]);
        }
        System.out.println("----------------------------");
        for (int i = 0; i < list_school.length; i++) {
            System.out.println(list_school[i][0] + " " + list_school[i][2]);
        }
        System.out.println("----------------------------");
        for (int i = 0; i < list_school.length; i++) {
            System.out.println(list_school[i][0] + " " + list_school[i][3]);
        }
        System.out.println("----------------------------");
        for (int i = 0; i < list_school.length; i++) {
            System.out.println(list_school[i][0] + " " + list_school[i][4]);
        }
        System.out.println("----------------");
        System.out.println(" Status Pernikahan " + is_married);
        System.out.println("Kemampuan : ");
        for (int i = 0; i < Skill.length; i++) {
            System.out.println(Skill[i][0] + " " + Skill[i][1]);
        }
        System.out.println("-----------------------");
        for (int i = 0; i < Skill.length; i++) {
            System.out.println(Skill[i][0] + " " + Skill[i][2]);
        }
        System.out.println("-----------------------");
        for (int i = 0; i < Skill.length; i++) {
            System.out.println(Skill[i][0] + " " + Skill[i][3]);
        }
        System.out.println("-----------------------");
        for (int i = 0; i < Skill.length; i++) {
            System.out.println(Skill[i][0] + " " + Skill[i][4]);
        }
        System.out.println("-----------------------");
        for (int i = 0; i < Skill.length; i++) {
            System.out.println(Skill[i][0] + " " + Skill[i][5]);
        }
        System.out.println("-----------------------");
        System.out.println("Tertarik terhadap coding = "+interest_in_coding);

    }
}
