package tugas3;

import tugas1.balok;

public class tgs3 {
    static boolean isCube(long input){
        long laus = Math.round(Math.cbrt(input));
        return (laus * laus * laus) == input;
    }

}