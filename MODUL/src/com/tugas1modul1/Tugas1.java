package com.tugas1modul1;

public class Tugas1 {
    public static void main(String[] args) {
        try {
            int[] arr = new int[5];
            arr[5] = 25;
//            System.out.println("indeks kelima : " +arr[4]);
        }catch (ArrayIndexOutOfBoundsException z){
            z.printStackTrace();
        }
    }
}
