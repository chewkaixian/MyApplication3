package com.example.taruc.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        readbird();

    }

    public void readbird(){
        EditText bired = findViewById(R.id.txtbirdbird);
        TextView txtview = findViewById(R.id.textView);
        txtview.setText(bired.toString());
    }
}
