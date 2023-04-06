package modul5;

import java.util.Scanner;
import static java.lang.Math.*;

public class tesmodul {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double corner;

        System.out.print("input corner : ");
        corner = input.nextDouble();

        System.out.println("SIN : " +sin(toRadians(corner)));
        System.out.println("SIN : " +cos(toRadians(corner)));
        System.out.println("SIN : " +tan(toRadians(corner)));
        System.out.println("SIN : " +1/tan(toRadians(corner)));
        System.out.println("SIN : " +1/cos(toRadians(corner)));
        System.out.println("SIN : " +1/sin(toRadians(corner)));
        System.out.println("SIN : " +acos(toRadians(corner)));
    }
}
