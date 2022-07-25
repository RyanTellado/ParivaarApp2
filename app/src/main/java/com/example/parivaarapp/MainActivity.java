package com.example.parivaarapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.Toolbar;

import com.google.firebase.firestore.FirebaseFirestore;

public class MainActivity extends AppCompatActivity {
    private Button button;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Code to change text of the toolbar
        ActionBar actionBar = getSupportActionBar();
        actionBar.setSubtitle("App Name");
        actionBar.setTitle("Login Screen");


        button=findViewById(R.id.clinic_login);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //code
                Intent intent = new Intent(MainActivity.this,ClinicLogin.class);
                startActivity(intent);
            }
        });

        button=findViewById(R.id.district_login);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //code
                Intent intent = new Intent(MainActivity.this,DistrictLogin.class);
                startActivity(intent);
            }
        });


        button=findViewById(R.id.master_login);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //code
                Intent intent = new Intent(MainActivity.this,MasterLogin.class);
                startActivity(intent);
            }
        });

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    //TODO change the item to the desired feature, add add intent to change screen, etc (also change in xml file)
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch(item.getItemId()){
            case R.id.Item:
                Toast.makeText(this, "Item was clicked", Toast.LENGTH_SHORT).show();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}




