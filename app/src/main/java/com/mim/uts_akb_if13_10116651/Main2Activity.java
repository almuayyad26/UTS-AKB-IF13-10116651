package com.mim.uts_akb_if13_10116651;

import android.support.annotation.NonNull;
import android.support.design.internal.BottomNavigationMenu;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Main2Activity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

    //10116651-Muhamad Iyad Muayyad-IF13

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        loadFragment(new Home_Fragment());
        BottomNavigationView bottomNavigationView = findViewById(R.id.bn_main);
        bottomNavigationView.setOnNavigationItemSelectedListener(this);

    }
    private boolean loadFragment(Fragment fragment) {
        if (fragment != null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.fl_container, fragment)
                    .commit();
            return true;
        }

        return false;
    }
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        Fragment fragment = null;

        switch (item.getItemId()){
            case R.id.home_menu:
                fragment = new Home_Fragment();
                break;
            case R.id.profil_menu:
                fragment = new Profil_Fragment();
                break;
            case R.id.kontak_menu:
                fragment = new Kontak_Fragment();
                break;
            case R.id.daftarteman_menu:
                fragment = new DaftarTeman_Fragment();
                break;
        }

        return loadFragment(fragment);
    }
}
