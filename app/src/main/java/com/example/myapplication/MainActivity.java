package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.example.myapplication.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private String usernameDB = "fuadagussalim";
    private String passwordDB = "1234";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());

        View view = binding.getRoot();
        setContentView(view);

        binding.btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String usernameInput = binding.username.getText().toString();
                final String passwordInput = binding.password.getText().toString();
                if (usernameInput.equals(usernameDB) && passwordInput.equals(passwordDB)){
                    binding.login.setText(String.valueOf("Anda berhasil login!"));
                    Toast.makeText(MainActivity.this, "Anda berhasil login!", Toast.LENGTH_SHORT).show();
                } else {
                    binding.login.setText(String.valueOf("Maaf, username dan password yang anda masukkan tidak cocok!"));
                    Toast.makeText(MainActivity.this, "Maaf, username dan password yang anda masukkan tidak cocok!", Toast.LENGTH_SHORT).show();
                }
                Log.d("Login", "onClick: "+ usernameInput);

            }
        });

       ;
    }
}