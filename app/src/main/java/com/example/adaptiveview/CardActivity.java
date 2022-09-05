package com.example.adaptiveview;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class CardActivity extends AppCompatActivity {
    FloatingActionButton fab;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card);
        fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(CardActivity.this, "The form has been successfully submitted. You may exit now!", Toast.LENGTH_SHORT).show();
                AlertDialog.Builder showInfo = new AlertDialog.Builder(CardActivity.this);
                TextView msg = new TextView(CardActivity.this);
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