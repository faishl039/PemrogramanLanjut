package com.tugas1modul2;

public class tugas1modul2 {
    static java.util.Scanner input = new java.util.Scanner(System.in);
    static String nim;
    static String nama;
    static String email;
    static String notel;
    static boolean ulangi = true;

    public static void main(String[] args) {
        do {
            try {
                System.out.print("NIM : ");
                nim = input.nextLine();
                if (nim.length() > 15) {
                    throw new Exception("Inputan Melebihi 15 Digit!");
                } else if (nim.length() < 15) {
                    throw new Exception("Inputan Kurang Dari 15 Digit!");
                } else if (!nim.matches("[0-9]*")){
                    throw new Exception("Inputan NIM Dilarang Huruf");
                }
                String defensiveNim = nim.substring(4, 12);
                if (!defensiveNim.equals("10370311")) {
                    throw new Exception("Inputan Tidak Termasuk Mahasiswa Informatika!");
                }
                System.out.println("NIM Berhasil di Input!");

                System.out.print("Nama : ");
                nama = input.nextLine();
                if (!nama.matches("[A-Za-z]*")) {
                    throw new Exception("Nama tidak boleh angka!");
                }
                System.out.println("Nama Berhasil di Input!");

                System.out.print("Email : ");
                email = input.nextLine();
                if (!email.endsWith("@webmail.umm.ac.id")) {
                    throw new Exception("Wajib Email UMM!");
                }
                System.out.println("Email Berhasil di Input!");

                System.out.print("No. HP :");
                notel = input.nextLine();
                if (!notel.matches("[0-9]*")) {
                    throw new Exception("No. HP Tidak Boleh Huruf!");
                }
                System.out.println("No. HP Berhasil di Input!");
            }
            catch (Exception e){
                ulangi = false;
                System.out.println(e);
//                e.printStackTrace();
            }
        }
        while (ulangi == false);
    }

//    public static void main(String[] args) {
//        while (ulangi){
//            try {
//                System.out.println("NIM : ");
//                nim = input.nextLine();
//                if (nim.length()>15){
//                    throw new Exception("Inputan Melebihi 15 Digit!");
//                }
//                else if (nim.length()<15){
//                    throw new Exception("Inputan Kurang Dari 15 Digit!");
//                }
//                else if (!nim.contains("10370311")){
//                    throw new Exception("Inputan Tidak Termasuk Mahasiswa Informatika!");
//                }
//                else if (nim.matches("[A-Za-z]*")){
//                    throw new Exception("Dilaramg huruf");
//                }else {
//                    ulangi = false;
//                }
//
//                //nama
//                System.out.println("Nama : ");
//                nama = input.nextLine();
//                if (!nama.matches("[A-Za-z]*")){
//                    throw new Exception("Nama tidak boleh angka!");
//                }
//                else {
//                    ulangi = false;
//                }
//
//                //email
//                System.out.println("Email : ");
//                email = input.nextLine();
//                if (!email.contains("@webmail.umm.ac.id")){
//                    throw new Exception("Wajib email umm!");
//                }
//                else {
//                    ulangi = false;
//                }
//
//                //nohp
//                System.out.println("No. HP : ");
//                notel = input.nextLine();
//                if (!notel.matches("[0-9]*")){
//                    throw new Exception("bukan no. hp");
//                }
//                else {
//                    ulangi = false;
//                }
//            }
//            catch (Exception e){
//                e.printStackTrace();
//            }
//        }
//    }
}
