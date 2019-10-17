package id.ac.polinema.utsprojectfebtrianp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import id.ac.polinema.utsprojectfebtrianp.util.PemesananTiket;

public class BookingPesanan extends AppCompatActivity {

    private EditText Nama;
    private EditText Nomor;
    private EditText Kota;
    private EditText Namabis;
    private EditText Jumlahtiket;
    private EditText Hargatiket;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booking_pesanan);

        Nama = findViewById(R.id.input_nama);
        Nomor = findViewById(R.id.input_nomor);
        Kota = findViewById(R.id.input_kota);
        Namabis = findViewById(R.id.input_namabis);
        Jumlahtiket = findViewById(R.id.input_jumlah);
        Hargatiket = findViewById(R.id.input_harga);



    }

    public void handlePesan(View view) {
        String nama = Nama.getText().toString();
        String nomor = Nomor.getText().toString();
        String kota = Kota.getText().toString();
        String namaBis = Namabis.getText().toString();
        int jumlahTiket = Integer.parseInt(Jumlahtiket.getText().toString());
        int hargaTiket = Integer.parseInt(Hargatiket.getText().toString());

        PemesananTiket pemesananTiket = new PemesananTiket(nama,nomor,kota,namaBis,jumlahTiket,hargaTiket);
        Intent i = new Intent(this,Result.class);
        i.putExtra("nama_key", pemesananTiket.getNama());
        i.putExtra("nomor_key", pemesananTiket.getNomor());
        i.putExtra("kota_key", pemesananTiket.getKota());
        i.putExtra("namabis_key", pemesananTiket.getNamabis());
        i.putExtra("jumlahtiket_key", pemesananTiket.getJumlahTiket());
        i.putExtra("hargatiket_key", pemesananTiket.getHargaTiket());
        i.putExtra("totalbayar_key", pemesananTiket.getTotalBayar());
        startActivity(i);
    }
}
