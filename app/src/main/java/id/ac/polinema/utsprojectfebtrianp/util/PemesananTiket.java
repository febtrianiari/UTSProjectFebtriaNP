package id.ac.polinema.utsprojectfebtrianp.util;

import android.os.Parcel;
import android.os.Parcelable;

public class PemesananTiket implements Parcelable {
    private String Nama;
    private String Nomor;
    private String Kota;
    //private String Namabis;
    private int JumlahTiket;
    private int HargaTiket;
    private int TotalBayar;

    public PemesananTiket(String Nama, String Nomor, int JumlahTiket, int HargaTiket){
        this.Nama = Nama;
        this.Nomor = Nomor;
        //this.Kota = Kota;
        //this.Namabis = Namabis;
        this.JumlahTiket = JumlahTiket;
        this.HargaTiket = HargaTiket;
        this.TotalBayar = calculate();
    }

//    private String Kota(){
//        String Kota = "Solo";
////        if(Kota == "Solo" && Kota =="Jogja"){
////
////        }else{
////
////        }
//        return Kota;
//    }
    private int calculate() {
        int hasil = JumlahTiket * HargaTiket;
        return hasil;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String nama) {
        Nama = nama;
    }

    public String getNomor() {
        return Nomor;
    }

    public void setNomor(String nomor) {
        Nomor = nomor;
    }

//    public String getKota() {
//        return Kota;
//    }
//
//    public void setKota(String kota) {
//        Kota = kota;
//    }

//    public String getNamabis() {
//        return Namabis;
//    }
//
//    public void setNamabis(String namabis) {
//        Namabis = namabis;
//    }

    public int getJumlahTiket() {
        return JumlahTiket;
    }

    public void setJumlahTiket(int jumlahTiket) {
        JumlahTiket = jumlahTiket;
    }

    public int getHargaTiket() {
        return HargaTiket;
    }

    public void setHargaTiket(int hargaTiket) {
        HargaTiket = hargaTiket;
    }

    public int getTotalBayar() {
        return TotalBayar;
    }

    public void setTotalBayar(int totalBayar) {
        TotalBayar = totalBayar;

    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.Nama);
        dest.writeString(this.Nomor);
//        dest.writeString(this.Kota);
//        dest.writeString(this.Namabis);
        dest.writeInt(this.JumlahTiket);
        dest.writeInt(this.HargaTiket);
        dest.writeInt(this.TotalBayar);
    }

    protected PemesananTiket(Parcel in) {
        this.Nama = in.readString();
        this.Nomor = in.readString();
//        this.Kota = in.readString();
//        this.Namabis = in.readString();
        this.JumlahTiket = in.readInt();
        this.HargaTiket = in.readInt();
        this.TotalBayar = in.readInt();
    }

    public static final Parcelable.Creator<PemesananTiket> CREATOR = new Parcelable.Creator<PemesananTiket>() {
        @Override
        public PemesananTiket createFromParcel(Parcel source) {
            return new PemesananTiket(source);
        }

        @Override
        public PemesananTiket[] newArray(int size) {
            return new PemesananTiket[size];
        }
    };
}
