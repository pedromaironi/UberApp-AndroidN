package com.pedromaironi.uber;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.pedromaironi.uber.Providers.AuthProvider;

import es.dmoral.toasty.Toasty;

public class LoginActivity extends AppCompatActivity {

    TextView mTextViewEmail;
    TextView mTextViewPassword;
    Button mButtonLogin;

    AuthProvider mAuth;

    DatabaseReference mDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        mTextViewPassword = findViewById(R.id.editTextPassword);
        mTextViewEmail = findViewById(R.id.editTextEmail);
        mButtonLogin = findViewById(R.id.btnLogin);

        mButtonLogin.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                login();
            }
        });

        mAuth = new AuthProvider();
        mDatabase = FirebaseDatabase.getInstance().getReference();
    }

    private void login() {
        String email = mTextViewEmail.getText().toString();
        String password = mTextViewPassword.getText().toString();

        if (!email.isEmpty() && !password.isEmpty()){
            if (password.length() >= 6){
                mAuth.login(email,password)
                        .addOnCompleteListener(new OnCompleteListener<AuthResult>(){
                            @Override
                            public void onComplete(@NonNull Task<AuthResult> task) {
                                // Login complete successful
                                if (task.isSuccessful())
                                {

                                } else {
                                    Toasty.error(LoginActivity.this, "The email or password are incorrect", Toast.LENGTH_LONG, true).show();
                                }
                            }
                        });
            }else{
                Toasty.info(LoginActivity.this, "The password must be greater than six digits", Toast.LENGTH_LONG, true).show();
            }
        }
    }

}