package com.inhatc.android_eventhandler;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private Button btnCall;
    private EditText objET;

    @Override
    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_main);

        btnCall = (Button) findViewById(R.id.button);
        objET = (EditText)findViewById(R.id.editTextPhone);

       btnCall.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view == btnCall) {
            Intent dialIntent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel: " + objET.getText()));
            dialIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(dialIntent);
        }
    }
}