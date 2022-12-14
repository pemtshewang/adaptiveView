package com.example.adaptiveview;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class FormActivity extends AppCompatActivity {
    Spinner country;
    String[] countryList = {"Australia","Bhutan","Nepal","India","Singapore","Malaysia","Switzerland","Greenland"};
    ArrayAdapter<String>  countryListVal;
    FloatingActionButton fab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);
        country = (Spinner) findViewById(R.id.country);
        countryListVal = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item,countryList);
        country.setAdapter(countryListVal);
        fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(FormActivity.this, "The form has been successfully submitted. You may exit now!", Toast.LENGTH_SHORT).show();
                AlertDialog.Builder showInfo = new AlertDialog.Builder(FormActivity.this);
                TextView msg = new TextView(FormActivity.this);
                msg.setText("The form has been successfully submitted. You may exit now!");
                showInfo.setTitle("Successful");
                showInfo.setView(msg);
                showInfo.setPositiveButton("Exit", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                    }
                });
            }
        });

    }
}