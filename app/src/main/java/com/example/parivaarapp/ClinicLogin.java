package com.example.parivaarapp;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Toolbar;

public class ClinicLogin extends AppCompatActivity {

    private EditText Username;
    private EditText Password;
    private TextView Info;
    private Button Login;


    @Override //
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clinic_login);

        //Code to change text of the toolbar
        ActionBar actionBar = getSupportActionBar();
        actionBar.setSubtitle("App Name");
        actionBar.setTitle("Clinic Login Screen");
        actionBar.setDisplayHomeAsUpEnabled(true);



        Username = (EditText) findViewById(R.id.username);
        Password = (EditText) findViewById(R.id.password);
        Login = (Button) findViewById(R.id.login);


        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validate(Username.getText().toString(), Password.getText().toString());
            }
        });

    }



    private void validate(String userName, String userPassword){
        if ((userName.equals("clinic")) && (userPassword.equals("parivaar"))){
            //correct password

            Toast.makeText(this, "CORRECT", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(ClinicLogin.this, Menu.class);
            startActivity(intent);
        }else{
            //wrong password
            Toast.makeText(this, "INCORRECT", Toast.LENGTH_SHORT).show();
        }
    }
}