package com.example.pu.rubike;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Register_Activity extends AppCompatActivity implements View.OnClickListener{

    Button bRegister;
    EditText etName, etPassword, etRUID, etEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_);

        etName = (EditText) findViewById(R.id.etName);
        etPassword = (EditText) findViewById(R.id.etPassword);
        etRUID = (EditText) findViewById(R.id.etRUID);
        etEmail = (EditText) findViewById(R.id.etEmail);
        bRegister = (Button) findViewById(R.id.bRegister);

        bRegister.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        switch (v.getId()){
            case R.id.bRegister:
        }
    }
}
