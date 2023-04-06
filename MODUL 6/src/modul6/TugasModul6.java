package modul6;

import java.io.*;
import java.util.*;

/**
 * Author: pesal
 */
public class TugasModul6 {

    // array List buat masukin array dr data
    static ArrayList<String> inString = new ArrayList<>();
    static ArrayList<Integer> inInt = new ArrayList<>();
    static int option, index, optionPilih;
    // utk buat file
    static File fileInt = new File("DataInteger.txt");
    static File fileString = new File("DataString.txt");

    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(System.in);
            do {
                menu();
                option = input.nextInt();
                switch (option) {
                    case 1:
                        try {
                            // file otomatis dbuat klo gaada
                            if (!fileInt.exists()) {
                                fileInt.createNewFile();
                            }else if(!fileString.exists()){
                                fileString.createNewFile();
                            }

                            // panjang array yang ingin dimasukkan
                            System.out.print("Masukkan Size: ");
                            int size = input.nextInt();
                            for (int i = 0; i < size; i++) {
                                System.out.print("Masukkan Data: ");
                                String data = input.next();
                                // isnum buat ngecek inputan berupa integer atau string
                                if (isNum(data)) {
                                    // add untuk menambahkan dalam index dan replace all digunakan untuk menghilangkan sesuai regex
                                    inInt.add(Integer.parseInt(data.replaceAll("([a-z])", "")));
                                    // Write int digunakan untuk menuliskan hasil kedalam file
                                    writeInt(fileInt, inInt);
                                } else {
                                    // add untuk menambahkan dalam index dan replace all digunakan untuk menghilangkan sesuai regex
                                    inString.add(data.replaceAll("([0-9])", ""));
                                    // Write int digunakan untuk menuliskan hasil kedalam file
                                    writeString(fileString, inString);
                                }
                                System.out.println("int : " + inInt + "\n str : " + inString);
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                        }

                        break;

                    case 2:
                        pilih();
                        optionPilih = input.nextInt();
                        switch (optionPilih) {
                            case 1 -> {
                                System.out.println("Tentukan index yang ingin dihapus: ");
                                index = input.nextInt();
                                // get buat nentuin index dari inputan
                                inInt.get(index);
                                inInt.remove(index);
                                //  menghapus index yang di pilih
                                System.out.println(inInt);
                                // update array
                                writeInt(fileInt, inInt);
                            }
                            case 2 -> {
                                System.out.println("Tentukan index yang ingin dihapus: ");
                                index = input.nextInt();
                                inString.get(index);
                                inString.remove(index);
                                System.out.println(inString);
                                writeString(fileString, inString);
                            }
                        }

                    case 3:
                        System.exit(0);
                }
            } while (option != 3);
        } catch (Exception j) {
            j.getStackTrace();
        }

    }

    public static void menu() {
        System.out.println("MENU");
        System.out.println("1: Add Data");
        System.out.println("2: Delete Data");
        System.out.println("3: Exit program");
        System.out.print("Enter your selection : ");
    }

    public static void pilih() {
        System.out.println("PILIH DATA YANG INGIN DIHAPUS: ");
        System.out.println("1: Integer Array");
        System.out.println("2: String Array");
    }

    // buat ngecek data inputan integer apa string
    static boolean isNum(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (!Character.isDigit(s.charAt(i)))
                return false;
        }
        return true;
    }

    static void writeInt(File filename, ArrayList<Integer> x) throws IOException {
        BufferedWriter outputWriter;
        outputWriter = new BufferedWriter(new FileWriter(filename));
        outputWriter.write(x + "\n");
//        outputWriter.flush();
        outputWriter.close();
    }

    static void writeString(File filename, ArrayList<String> x) throws IOException {
        BufferedWriter outputWriter;
        outputWriter = new BufferedWriter(new FileWriter(filename));
        outputWriter.write(x + "\n");
//        outputWriter.flush();
        outputWriter.close();
    }
}