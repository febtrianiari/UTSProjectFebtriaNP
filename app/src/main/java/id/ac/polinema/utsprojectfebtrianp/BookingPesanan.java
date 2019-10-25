package id.ac.polinema.utsprojectfebtrianp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import java.security.SecurityPermission;

import id.ac.polinema.utsprojectfebtrianp.util.PemesananTiket;

public class BookingPesanan extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    private EditText Nama;
    private EditText Nomor;
    private EditText Jumlahtiket;
    private EditText Hargatiket;
    private Spinner Kota;
    private Spinner Namabis;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booking_pesanan);


        Nama = findViewById(R.id.input_nama);
        Nomor = findViewById(R.id.input_nomor);
        Kota = (Spinner) findViewById(R.id.spKota);
        Namabis = (Spinner) findViewById(R.id.spNamabis);
        //Kota = findViewById(R.id.input_kota);
        //Namabis = findViewById(R.id.input_namabis);
        Jumlahtiket = findViewById(R.id.input_jumlah);
        Hargatiket = findViewById(R.id.input_harga);

        if (Kota != null) {
            Kota.setOnItemSelectedListener(this);
        }
//        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
//                R.array.Kota, android.R.layout.booking);
    }

    public void handlePesan(View view) {
        String nama = Nama.getText().toString();
        String nomor = Nomor.getText().toString();
        //String kota = Kota.getText().toString();
        //String namaBis = Namabis.getText().toString();
        int jumlahTiket = Integer.parseInt(Jumlahtiket.getText().toString());
        int hargaTiket = Integer.parseInt(Hargatiket.getText().toString());


        PemesananTiket pemesananTiket = new PemesananTiket(nama,nomor,jumlahTiket,hargaTiket);
        Intent i = new Intent(this,Result.class);
        i.putExtra("nama_key", pemesananTiket.getNama());
        i.putExtra("nomor_key", pemesananTiket.getNomor());
       // i.putExtra("kota_key", pemesananTiket.getKota());
        //i.putExtra("namabis_key", pemesananTiket.getNamabis());
        i.putExtra("jumlahtiket_key", pemesananTiket.getJumlahTiket());
        i.putExtra("hargatiket_key", pemesananTiket.getHargaTiket());
        i.putExtra("totalbayar_key", pemesananTiket.getTotalBayar());
        startActivity(i);


    }


    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}
