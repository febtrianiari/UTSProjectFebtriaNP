package id.ac.polinema.utsprojectfebtrianp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class halamanMenuUtama extends AppCompatActivity{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman_menu_utama);
    }


    public void handleJadwalBis(View view) {
        Intent intent = new Intent(this, JadwalBis.class);
        startActivity(intent);
    }


    public void handlerDetailBis(View view) {
        Intent intent = new Intent(this, DetailBus.class);
        startActivity(intent);
    }

    public void handlerPesanTiket(View view) {
        Intent intent = new Intent(this, BookingPesanan.class);
        startActivity(intent);
    }

}
