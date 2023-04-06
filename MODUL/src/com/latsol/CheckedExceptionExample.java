package com.latsol;

import java.io.*;

public class CheckedExceptionExample {
    //tambahkan throws di line 7 setelah args
    public static void main(String[] args) throws IOException {
        FileInputStream file_data = null;
        file_data = new FileInputStream("C:/Users/Pesal/Desktop/Hello.txt");
        int m;
        while ((m = file_data.read()) !=-1){
            System.out.println((char)m);
        }
        file_data.close();
    }
}
