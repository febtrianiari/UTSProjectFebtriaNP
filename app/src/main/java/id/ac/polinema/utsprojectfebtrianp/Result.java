package id.ac.polinema.utsprojectfebtrianp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Result extends AppCompatActivity {

    private TextView Nama;
    private TextView Nomor;
    private TextView Kota;
    private TextView Namabis;
    private TextView Jumlahtiket;
    private TextView Hargatiket;
    private TextView TotalBayar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        Nama = findViewById(R.id.namapemesan);
        Nomor = findViewById(R.id.nomorpemesan);
        Kota = findViewById(R.id.kotatujuan2);
        Namabis = findViewById(R.id.namabis);
        Jumlahtiket = findViewById(R.id.jumlahtiket2);
        Hargatiket = findViewById(R.id.hargatiket2);
        TotalBayar = findViewById(R.id.totalbayar);

        String Nama_Pemesan;
        String Nomor_Pemesan;
        String Kota_Tujuan;
        String Nama_Bis;
        int Jumlah_Tiket;
        int Harga_Tiket;
        int Total_Bayar;
        Bundle extras = getIntent().getExtras();
        if(extras != null){
            Nama_Pemesan = extras.getString("nama_key");
            Nomor_Pemesan = extras.getString("nomor_key");
            Kota_Tujuan = extras.getString("kota_key");
            Nama_Bis = extras.getString("namabis_key");
            Jumlah_Tiket = extras.getInt("jumlahtiket_key");
            Harga_Tiket = extras.getInt("hargatiket_key");
            Total_Bayar = extras.getInt("totalbayar_key");

            Nama.setText(Nama_Pemesan.toString());
            Nomor.setText(Nomor_Pemesan.toString());
            Namabis.setText(Nama_Bis.toString());
            Kota.setText(Kota_Tujuan.toString());
            Jumlahtiket.setText(String.valueOf(Jumlah_Tiket).toString());
            Hargatiket.setText(String.valueOf(Harga_Tiket).toString());
            TotalBayar.setText(String.valueOf(Total_Bayar).toString());
        }
    }

    public void handlerOK(View view) {
        Intent intent = new Intent(this, halamanMenuUtama.class);
        startActivity(intent);
    }
}
