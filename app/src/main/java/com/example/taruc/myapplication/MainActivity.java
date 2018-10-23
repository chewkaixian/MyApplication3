package com.example.taruc.myapplication;

import android.support.v7.app.AppCompatActivity;
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
    }

    public void readbird(View view){
        EditText bired = findViewById(R.id.txtbirdbird);
        TextView txtview = findViewById(R.id.textView);
        txtview.setText(bired.getText().toString());
    }
}
