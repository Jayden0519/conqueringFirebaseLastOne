package com.example.conqueringfirebaselastone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView username = findViewById(R.id.UserName);
        TextView password = findViewById(R.id.password);

        MaterialButton loginBtn = (MaterialButton) findViewById(R.id.loginBtn);

        //correct password

        loginBtn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                if(username.getText().toString().equals("admin") && password.getText().toString().equals("admin"))
                {
                    //password is correct
                    Toast.makeText(MainActivity.this, "login accepted", Toast.LENGTH_SHORT).show();
                } else
                    //incorrect
                    Toast.makeText(MainActivity.this, "login declined", Toast.LENGTH_SHORT).show();

            }
        });



    }
}