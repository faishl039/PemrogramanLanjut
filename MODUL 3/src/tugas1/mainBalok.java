package tugas1;

import java.util.Scanner;

public class mainBalok {
    public static void main(String[] args) {
        balok mbalok = new balok();
        Scanner input = new Scanner(System.in);
        System.out.print("Panjang : ");
        mbalok.setPanjang(input.nextInt());
        System.out.print("Lebar : ");
        mbalok.setLebar(input.nextInt());
        System.out.print("Tinggi : ");
        mbalok.setTinggi(input.nextInt());

        mbalok.hasil();
    }

}
