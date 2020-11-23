package com.example.converter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ConverterApp();
    }

    public void ConverterApp(){
        Button btn = findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText pak = findViewById(R.id.amount);
                TextView ans = findViewById(R.id.answere);

                float PKR = Float.parseFloat(pak.getText().toString());
                float Res = PKR / 157;

                ans.setText(String.valueOf(Res)+" $");
            }
        });
    }
}