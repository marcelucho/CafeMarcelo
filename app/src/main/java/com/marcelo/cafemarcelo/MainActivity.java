package com.marcelo.cafemarcelo;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {



    DrawerLayout dLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate( savedInstanceState);
        setContentView(R.layout.activity_main);
        setNavigationDrawer();
    }
    private void setNavigationDrawer(){
        dLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        NavigationView navView = (NavigationView) findViewById(R.id.navigation);

        navView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener(){
            @Override
            public boolean onNavigationItemSelected(MenuItem menuItem){
                Fragment frag = null;
                int itemID = menuItem.getItemId();

                if(itemID == R.id.mnuHome){
                    frag = new FragmentoHome();
                } else if (itemID == R.id.mnuColeccion) {
                    frag = new FragmentoColeccion();
                }
                Toast.makeText(getApplicationContext(), menuItem.getTitle(), Toast.LENGTH_SHORT).show();

                if (frag != null){
                    FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                    transaction.replace(R.id.frame, frag);
                    transaction.commit();
                    dLayout.closeDrawers();
                    return true;
                }
                return false;
            }
        });
    }
}

