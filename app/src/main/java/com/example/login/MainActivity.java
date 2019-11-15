package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button login;
    EditText user, pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        login = findViewById(R.id.bt_login);
        user = findViewById(R.id.edit_user);
        pass = findViewById(R.id.edit_pass);

        login.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        String username = login.getText().toString();
        String ps = pass.getText().toString();
        switch (view.getId()){
            case R.id.bt_login:
                if(TextUtils.isEmpty(username)| TextUtils.isEmpty(ps)){
                Toast.makeText(this, "Silahkan Cek Kembali Data Anda", Toast.LENGTH_SHORT).show();
            }else {
                    Intent intent = new Intent(MainActivity.this, HomeActivity.class);
                    startActivity(intent);
                    break;
                }
        }
    }
}
