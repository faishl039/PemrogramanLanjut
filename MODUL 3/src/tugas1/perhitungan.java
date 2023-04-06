package tugas1;

public class perhitungan {
    public int luas;
    public int volume;

    //luas
    public int getLuas() {
        return luas;
    }
    public void setLuas(int panjang, int lebar, int tinggi) {
        luas(panjang, lebar, tinggi);
    }

    private void luas(int panjang, int lebar, int tinggi) {
        luas = (2* panjang * lebar)+(2* lebar * tinggi)+(2* panjang * tinggi);
    }

    //vol
    public int getVolume() {
        return volume;
    }
    public void setVolume(int panjang, int lebar, int tinggi) {
        volume(panjang, lebar, tinggi);
    }
    private void volume(int panjang, int lebar, int tinggi) {
        volume = panjang * lebar * tinggi;
    }

}

//    balok sisi = new balok();
//    int luas, volume;
//    public int panjang = sisi.getPanjang();



//    public void perhitungan(){
//        int panjang = sisi.getPanjang();
//        int lebar = sisi.getLebar();
//        int tinggi = sisi.getTinggi();
//
//        //mentah
//        luas = ((lebar * panjang)+(panjang * tinggi)+(lebar * tinggi)) * 2;
//        volume = panjang*lebar*tinggi;
//
//    }

//    balok sisi = new balok();
//    int luas, volume;
//
//
//
//    public void perhitungan(){
//        int panjang = sisi.getPanjang();
//        int lebar = sisi.getLebar();
//        int tinggi = sisi.getTinggi();
//
//        //mentah
//        luas = ((lebar * panjang)+(panjang * tinggi)+(lebar * tinggi)) * 2;
//        volume = panjang*lebar*tinggi;
//
//    }8