package com.example.weathercast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText typeTheCity;
    private Button search;
    private TextView temperature;
    private TextView feltTemperature;
    private ImageView imageView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        search = findViewById(R.id.button);
        typeTheCity = findViewById(R.id.editText);
        temperature = findViewById(R.id.textView4);
        feltTemperature = findViewById(R.id.feelTemp);


    }
}
