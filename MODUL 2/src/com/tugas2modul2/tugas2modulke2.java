package com.tugas2modul2;

import java.util.Scanner;

public class tugas2modulke2 {
    static String book  = "This is Book, Malang. 2022";
    static String [] place = {"Malang","Bandung","Surabaya"};
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Library");
        System.out.print("Name Book : ");
        String inputName = input.nextLine();
        cekName(inputName);

        System.out.print("From : ");
        String inputFrom = input.nextLine();
        cekFrom(inputFrom);

        System.out.print("Date Prod : ");
        int inputDate = input.nextInt();
        cekDate(inputDate);

        String list = String.format("%s, %s. %d", inputName, inputFrom, inputDate);

        System.out.print("BUKU BERHASIL DITAMBAHKAN!\n"+list +"\n" );
        list();
    }

    static void cekDate(int date){
        //AND
        //inputan date harus dalam rentang waktu 2018-2022
        try {
            if(date >= 2018 && date <= 2022){
//                System.out.print("DATE TRUE\n");
            }else {
                System.out.print("DATE FALSE\n");
                System.exit(1);
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    static void cekFrom(String from){
        //harus berasal dari yang terdapat pd array
        int x = 0;
        for (String place1 : place) {
            if (from.compareTo(place1) == 0) {
                x = 1;
            }
        }
        if(x == 1);
        else{
            System.out.println("TEMPAT TIDAK SESUAI!\n");
            System.exit(1);
        }
    }

    static void cekName(String name){
        String newbook = "This is Book";
        for(int i = 0; !"".equals(book); i++){
            if(name.compareTo(newbook)==0){
                System.out.print("Nama buku sudah ditambahkan.\n");
                System.exit(i);
            }else break;
        }
    }
    public static void list(){
        System.out.println(book);
    }
}
