package id.ac.polinema.utsprojectfebtrianp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import id.ac.polinema.utsprojectfebtrianp.DetailBis.DetailJamHarga;

public class DetailBus extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_bus);
    }

    public void handlerDetailJamHarga(View view) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        DetailJamHarga detailJamHarga = (DetailJamHarga) getSupportFragmentManager().findFragmentByTag("DETAIL_JAMHARGA");
        if (detailJamHarga != null && detailJamHarga.isVisible()) {
            //fragmentTransaction.commit();
        } else {
            fragmentTransaction.setCustomAnimations(R.anim.enter_from_left, R.anim.enter_from_right, R.anim.exit_from_left, R.anim.exit_from_right);
            fragmentTransaction.replace(R.id.JamDanHarga, new DetailJamHarga(), "DETAIL_JAMHARGA");
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();
        }
    }


    public void handlerGoBack(View view) {
        Intent intent = new Intent(this, halamanMenuUtama.class);
        startActivity(intent);
    }
}
