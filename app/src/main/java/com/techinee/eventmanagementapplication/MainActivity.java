package com.techinee.eventmanagementapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnType1 = (Button) findViewById(R.id.btnType1);
        btnType1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Event Type 1", Toast.LENGTH_LONG).show();
            }
        });

        Button btnType3 = (Button) findViewById(R.id.btnType3);
        btnType3.setOnClickListener(this);
    }

    public void buttonOnClick2(View view){
        Toast.makeText(this, "Event Type 2", Toast.LENGTH_LONG).show();
    }


    @Override
    public void  onClick(View view){
        Toast.makeText(this, "Event Type 3", Toast.LENGTH_LONG).show();
    }


}