package com.tugas2modul1;

public class Tugas2 {
    static java.util.Scanner input = new java.util.Scanner(System.in);
    static String nim;
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
                }else {
                    ulangi = false;
                }
                System.out.println("Selamat, NIM Berhasil di Input!");
            }
            catch (Exception e){
                e.printStackTrace();
            }
//            finally {
//                System.out.println("Terimakasih!");
//            }
        }

    }
}
