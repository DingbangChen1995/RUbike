package com.example.pu.rubike;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Login_Activity extends AppCompatActivity implements View.OnClickListener{

    Button bLogin;
    EditText etUsername, etPassword;
    TextView linkRegisterHere;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_);

        etUsername = (EditText) findViewById(R.id.etUsername);
        etPassword = (EditText) findViewById(R.id.etPassword);
        bLogin = (Button) findViewById(R.id.bLogin);
        linkRegisterHere = (TextView) findViewById(R.id.linkRegisterHere);

        bLogin.setOnClickListener(this);
        linkRegisterHere.setOnClickListener(this);
    }

    public void onClick(View v){
        switch(v.getId()){
            case R.id.bLogin:

                break;

            case R.id.linkRegisterHere:
                startActivity(new Intent(this, Register_Activity.class));
                break;
        }
    }
}
