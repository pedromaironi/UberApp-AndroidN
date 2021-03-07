package com.pedromaironi.uber.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.pedromaironi.uber.R;
import com.pedromaironi.uber.SelectOptionOutActivity;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    Button mButtonClient;
    Button mButtonDriver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mButtonClient = findViewById(R.id.Client);
        mButtonDriver = findViewById(R.id.Driver);

        mButtonClient.setOnClickListener(new View.OnClickListener(){
           @Override
           public void onClick(View v){
                goToSelectAuth();
           }
        });

        mButtonDriver.setOnClickListener(new View.OnClickListener(){
           @Override
           public void onClick(View v){
               goToSelectAuth();
           }
        });
    }

    private void goToSelectAuth() {
        Intent intent = new Intent(MainActivity.this, SelectOptionOutActivity.class);
        startActivity(intent);
    }


}