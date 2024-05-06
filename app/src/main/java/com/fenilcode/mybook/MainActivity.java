package com.fenilcode.mybook;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    DrawerLayout drawerLayout;
    NavigationView navigationView;
    Toolbar toolbar1;
    private Button IT,COMP,DSA,APTITUDE;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        drawerLayout = findViewById(R.id.drawerlayout);
        navigationView = findViewById(R.id.navigationview);
        toolbar1 = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar1);
        navigationView.bringToFront();

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this,drawerLayout,toolbar1,R.string.navigation_open,R.string.navigation_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);

        IT = findViewById(R.id.IT);
        COMP = findViewById(R.id.Comp);
        DSA = findViewById(R.id.dsa);
        APTITUDE = findViewById(R.id.aptitude);
        IT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openIT();
            }
        });
        COMP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCE();
            }
        });
        DSA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDSA();
            }
        });
        APTITUDE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAPTITUDE();
            }
        });
    }

    private void openAPTITUDE() {
        Intent intent = new Intent(this, APTITUDE.class);
        startActivity(intent);
    }

    private void openDSA() {
        Intent intent = new Intent(this, DSA.class);
        startActivity(intent);
    }

    private void openCE() {
        Intent intent = new Intent(this, ComputerEngineering.class);
        startActivity(intent);
    }

    @Override
    public void onBackPressed()
    {
        if(drawerLayout.isDrawerOpen(GravityCompat.START))
        {
            drawerLayout.closeDrawer(GravityCompat.START);
        }
        else
        {
            super.onBackPressed();
        }
    }


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        int menuItemId = menuItem.getItemId();

        if (menuItemId == R.id.nav_about) {
            startActivity(new Intent(MainActivity.this, AboutUsActivity.class)); // Open About Us activity
            return true;
        }
        else if(menuItemId == R.id.nav_share)
        {
            shareApp();
            return true;
        }
        else if (menuItemId == R.id.nav_join_whatsapp_group) {
            // Create an intent to join the WhatsApp group
try {

    Intent intentWhatsapp = new Intent(Intent.ACTION_VIEW);
    String url = "https://chat.whatsapp.com/ENDfH6RAPzWCfdJQcTo78J";
    intentWhatsapp.setData(Uri.parse(url));
    intentWhatsapp.setPackage("com.whatsapp");
    startActivity(intentWhatsapp);
}catch (Exception e){
    Toast.makeText(this,"WhatsApp is Not Installed.",Toast.LENGTH_SHORT).show();
}
            return true;
        }
        else {
            // Handle other menu items here if needed
            return false;
        }
    }

    private void shareApp() {
        Intent shareIntent = new Intent(Intent.ACTION_SEND);
        shareIntent.setType("text/plain");
        String shareMessage = "Check out this amazing app!";
        shareMessage = shareMessage + "\n\nDownload the app from: https://play.google.com/store/apps/details?id=" + getPackageName();
        shareIntent.putExtra(Intent.EXTRA_TEXT, shareMessage);
        startActivity(Intent.createChooser(shareIntent, "Share via"));
    }


    private void openIT() {
        Intent intent = new Intent(this, IT.class);
        startActivity(intent);
    }
}
