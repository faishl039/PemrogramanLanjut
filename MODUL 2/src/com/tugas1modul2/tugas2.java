package com.tugas1modul2;

public class tugas2 {
    static java.util.Scanner input = new java.util.Scanner(System.in);
    static String nim;
    static String email;
    static String notel;
    static boolean ulangi = true;

    public static void main(String[] args) {
        while (ulangi) {
            try{
                System.out.println("Input NIM Anda Dibawah : ");
                nim = input.nextLine();
                if (nim.length()>15){
                    throw new Exception("Inputan Melebihi 15 Digit!");
                }
                else if (nim.length()<15){
                    throw new Exception("Inputan Kurang Dari 15 Digit!");
                }
                else if (!nim.contains("10370311")){
                    throw new Exception("Inputan Tidak Termasuk Mahasiswa Informatika!");
                }
                else {
                    ulangi = false;
                }
                System.out.println("Selamat, NIM Berhasil di Input!");

                System.out.println("email : ");
                email = input.nextLine();
                if (!email.contains("@webmail.umm.ac.id")){
                    throw new Exception("Tidak termasuk email umm");
                }
//                else if (email.toUpperCase()){
//                    throw new Exception("em");
//                }
//                else {
//                    ulangi = false;
//                }
                System.out.println("email acc");
            }
            catch (Exception e){
                e.printStackTrace();
                ulangi = false;
            }
        }

//        while (ulangi){
//            try {
//                System.out.println("hp : ");
//                notel = input.nextLine();
//                if (!notel.matches("[0-9]")){
//                    throw new Exception("Tidak termasuk no tlp");
//                }
//                else {
//                    ulangi = false;
//                }
//                System.out.println("no hp acc");
//            }
//            catch (Exception e){
//                e.printStackTrace();
//            }
//        }

    }
}