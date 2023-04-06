package modul5;

import java.util.Scanner;

public class SortWithoutAPI {
    public static void main(String[] args) {
        int []unsort = {-75, -10, 0, 30, 0, -30, 90, 70, 89, -50, -55, -30};
        for (int i=0; i<unsort.length; i++){
            for (int j = i+1; j<unsort.length; j++){
                if (unsort[i]>unsort[j]){
                    int sorted = unsort[i];
                    unsort[i] = unsort[j];
                    unsort[j] = sorted;
                }
            }
        }

        for (int j : unsort) {
            System.out.print(j +", ");
        }

        Scanner input = new Scanner(System.in);
        System.out.print("\nAngka yg ingin diketahui indexnya : ");
        int cari = input.nextInt();
        for (int i = 0; i< unsort.length ; i++){
            if (unsort[i] == cari){
                System.out.println("index : " +i);
            }
        }
    }
}
