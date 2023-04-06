package tugas1;

public class balok {
    private int panjang;
    private int lebar;
    private int tinggi;


    protected void hasil(){
        perhitungan ph = new perhitungan();
        ph.setLuas(getPanjang(), getLebar(), getTinggi());
        ph.setVolume(getPanjang(), getLebar(), getTinggi());
        System.out.println("Luas Balok = " +ph.getLuas());
        System.out.println("Volume Balok = " +ph.getVolume());
    }

    public int getPanjang() {
        return panjang;
    }

    public void setPanjang(int panjang) {
        this.panjang = panjang;
    }

    public int getLebar() {
        return lebar;
    }

    public void setLebar(int lebar) {
        this.lebar = lebar;
    }

    public int getTinggi() {
        return tinggi;
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }
}