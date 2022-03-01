package com.nitolniloygroup.nngtrainingsession;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView txtResult;
    EditText input1, input2;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i("nng training sesison", "onCreate: ");

        txtResult = findViewById(R.id.txt_result);
        txtResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        input1 = findViewById(R.id.et_num1);
        input2 = findViewById(R.id.et_num2);

        btn = findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int i1 =  Integer.parseInt(input1.getText().toString());
                int i2 = Integer.parseInt(input2.getText().toString());
                txtResult.setText(String.valueOf(i1+i2));
            }
        });

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("nng training sesison", "on start: ");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("nng training sesison", "on resume: ");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("nng training sesison", "onPause: ");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("nng training sesison", "onStop: ");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("nng training sesison", "onDestroy: ");
    }


}