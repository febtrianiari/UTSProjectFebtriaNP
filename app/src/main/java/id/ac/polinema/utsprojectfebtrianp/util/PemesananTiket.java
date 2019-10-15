package id.ac.polinema.utsprojectfebtrianp.util;

public class PemesananTiket {
    private int JumlahTiket;
    private int HargaTiket;
    private float TotalBayar;

    public PemesananTiket(int jumlahTiket, int hargaTiket) {
        this.JumlahTiket = jumlahTiket;
        this.HargaTiket = hargaTiket;
        this.TotalBayar = calculate();
    }

    public float getTotalBayar() {
        return TotalBayar;
    }

    private float calculate() {
        return(JumlahTiket * HargaTiket);
    }
}
