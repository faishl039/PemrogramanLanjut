package modul5;

import java.util.Arrays;
import java.util.Scanner;

public class SortWithAPI {
    public static void main(String[] args) {
        int []unsort = {-75, -10, 0, 30, 0, -30, 90, 70, 89, -50, -55, -30};
        Arrays.sort(unsort);
        for (int sorted : unsort){
            System.out.print(sorted + ", ");
        }

        Scanner input = new Scanner(System.in);
        System.out.print("\nAngka yg ingin diketahui indexnya : ");
        int cari = input.nextInt();
        System.out.println("index : " +Arrays.binarySearch(unsort, cari));
    }
}
