package com.example.weatherapp;



import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class loginActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.loginlayout);

        EditText Email = (EditText) findViewById(R.id.email);
        EditText password =(EditText) findViewById(R.id.password);
        Button Login =(Button) findViewById(R.id.Login);
        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent firstaction=new Intent(getApplicationContext(), listActivity.class);
                startActivity(firstaction);
            }
        });
    }


}
