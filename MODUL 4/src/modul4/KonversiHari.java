package modul4;

import java.util.Scanner;

public class KonversiHari {
    int jmlhr;

    //livetemplate rumus konversi (tugas 1)
    int tahun() {
        int th;
        th = jmlhr / 365;
        return th;
    }

    int bulan() {
        int bln;
        bln = (jmlhr - tahun() * 365) / 30;
        return bln;
    }

    int hari() {
        int hr;
        hr = (jmlhr - tahun() * 365 - bulan() * 30);
        return hr;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        KonversiHari kh = new KonversiHari();

        //implemen blok kode dg method (tugas2)
        extracted(input, kh);

        System.out.println(kh.jmlhr + " Hari = " + kh.tahun() + " Tahun, " + kh.bulan() + " Bulan, " + kh.hari() + " Hari ");

    }

    private static void extracted(Scanner input, KonversiHari kh) {
        System.out.print("Jumlah Hari : ");
        kh.jmlhr = input.nextInt();
    }

}
