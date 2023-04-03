package com.inhatc.android_togglebutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    ToggleButton objButton = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        objButton = (ToggleButton)findViewById(R.id.tglOnOff);
        objButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (objButton.isChecked()) {
            Toast.makeText(MainActivity.this, "ON", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(MainActivity.this, "OFF", Toast.LENGTH_SHORT).show();
        }
    }
}