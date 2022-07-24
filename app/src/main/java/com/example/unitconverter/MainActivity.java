package com.example.unitconverter;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.bumptech.glide.Glide;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    GoogleSignInAccount account;
    private ImageAdapter adapter;

    CardView temperature;
    CardView mass;
    CardView length;
    CardView speed;
    CardView volume;
    CardView time;
    CardView fuel;
    CardView area;
    CardView pressure;
    CardView frequency;
    CardView energy;
    CardView storage;
    TextView timer;
    CardView past;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            account = (GoogleSignInAccount) extras.get("user");
        }
        TextView welcome = findViewById(R.id.welcomeTV);
        welcome.setText("Welcome, " + account.getDisplayName());

        ImageView userImage = findViewById(R.id.mainuserimage);
        Glide.with(this).load(account.getPhotoUrl()).into(userImage);


        temperature = findViewById(R.id.temperature);
        mass = findViewById(R.id.mass);
        length = findViewById(R.id.length);
        speed = findViewById(R.id.speed);
        volume = findViewById(R.id.volume);
        time = findViewById(R.id.time);
        fuel = findViewById(R.id.fuel);
        area = findViewById(R.id.area);
        pressure = findViewById(R.id.pressure);
        frequency = findViewById(R.id.frequency);
        energy = findViewById(R.id.energy);
        storage = findViewById(R.id.storage);
        timer = findViewById(R.id.timer);
        past = findViewById(R.id.past);
        Calendar c = Calendar.getInstance();
        System.out.println("Current dateTime => " + c.getTime());
        SimpleDateFormat df = new SimpleDateFormat("HH:mm");
        String formattedDate = df.format(c.getTime());
        timer.setText("Current Time : "+formattedDate);
        temperature.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, con_temperature.class));
            }
        });
        mass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, con_mass.class));
            }
        });
        length.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, con_length.class));
            }
        });
        speed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, con_speed.class));
            }
        });
        volume.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, con_volume.class));
            }
        });
        time.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, con_time.class));
            }
        });
        fuel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, con_fuel.class));
            }
        });
        area.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, con_area.class));
            }
        });
        pressure.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, con_pressure.class));
            }
        });
        frequency.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, con_frequency.class));
            }
        });
        energy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, con_energy.class));
            }
        });
        storage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, con_storage.class));
            }
        });
        // Obtain the FirebaseAnalytics instance.
        past.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, screenshot.class));
            }
        });
    }

}