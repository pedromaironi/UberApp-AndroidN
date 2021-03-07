package com.pedromaironi.uber;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SelectOptionOutActivity extends AppCompatActivity {

    Toolbar mToolbar;
    Button mbuttonRegister;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_option_out);
        mbuttonRegister = findViewById(R.id.RegisterNow);
        mToolbar = findViewById(R.id.toolbar);
        setSupportActionBar(mToolbar);
        getSupportActionBar().setTitle("Select option");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true); // activate in manifest parent activity name = MainActivity

        mbuttonRegister.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                goToRegisterUser();
            }
        });
    }

    private void goToRegisterUser() {
        Intent intent = new Intent(SelectOptionOutActivity.this, RegisterActivity.class);
                startActivity(intent);
    }
}