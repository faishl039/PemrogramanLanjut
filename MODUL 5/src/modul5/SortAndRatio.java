package modul5;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class SortAndRatio {
    public static void main(String[] args) {
        int positif = 0, negatif = 0, zero = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Size Data : ");
        int szdt = input.nextInt();
        int[] arrszdt = new int[szdt];
        double jmldt = arrszdt.length;

        System.out.print("Input Data : ");
        for (int i = 0; i<szdt; i++){
            arrszdt[i] = input.nextInt();
        }

        Arrays.sort(arrszdt);
        for (int arrSorted : arrszdt){
            System.out.print(arrSorted + ", ");
        }

//        if (arrszdt > 0){
//            int positif ++;
//        }

        for (int j : arrszdt) {
            if (j > 0) {
                positif ++;
            } else if (j == 0) {
                zero ++;
            } else {
                negatif ++;
            }
        }

        double hslPositif = positif/jmldt;
        double hslNegatif = negatif/jmldt;
        double hslZero = zero/jmldt;

//        System.out.println("\nPositif : " +hslPositif);
//        System.out.println("Negatif : " +hslNegatif);
//        System.out.println("Zero : " +hslZero);

        System.out.println("\nPositif : " +new DecimalFormat("##.##").format(hslPositif));
        System.out.println("Negatif : " +new DecimalFormat("##.##").format(hslNegatif));
        System.out.println("Zero : " +new DecimalFormat("##.##").format(hslZero));
    }

}
