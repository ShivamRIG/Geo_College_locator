package com.example.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Spinner spin;
    String[] city={"Pune","Aurangabad","Nagpur","Mumbai"};
    private String value;
    private TextView txt;
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spin= (Spinner) findViewById(R.id.spinner);
        ArrayAdapter<String> adt=new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item,city);
        spin.setAdapter(adt);
        Button btn=(Button) findViewById(R.id.button6);
        txt=(TextView) findViewById(R.id.textView);
        btn.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
    value=spin.getSelectedItem().toString();
    txt.setText("The selected city is "+value);
    switch (value){
            case "pune":
            intent=new Intent(android.content.Intent.ACTION_VIEW,
                    Uri.parse("https://www.google.com/maps/search/?api=1&query=Pune+Colleges+enginerring"));
                break;
            case "Aurangabad":
            intent=new Intent(android.content.Intent.ACTION_VIEW,
                    Uri.parse("https://www.google.com/maps/search/?api=1&query=Aurangabad+Colleges+enginerring"));
                break;
            case "nagpur":
            intent=new Intent(android.content.Intent.ACTION_VIEW,
                    Uri.parse("https://www.google.com/maps/search/?api=1&query=nagpur+Colleges+enginerring"));
            break;
            case "Mumbai":
            intent=new Intent(android.content.Intent.ACTION_VIEW,
                    Uri.parse("https://www.google.com/maps/search/?api=1&query=Mumbai+Colleges+enginerring"));
            break;
        default:
            txt.setText("please selcted  the text");

    }
    startActivity(intent);


    }
}



