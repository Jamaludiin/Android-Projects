package com.example.uibasics;


import static com.example.uibasics.R.id.btnOneHello;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity{



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // this is another way of setting a click listener

        Button btnHello = findViewById(btnOneHello);
        btnHello.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("Hello I am a click listener method");
                Toast.makeText(getApplicationContext(), "Button clicked", Toast.LENGTH_SHORT).show();
                Toast.makeText(MainActivity.this, "Long Toast", Toast.LENGTH_LONG).show();
            }
        });


        // button two
        Button btnHello2 = findViewById(R.id.btnTwoHello);
        btnHello2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("Hello I am a click listener two in method");
                Toast.makeText(getApplicationContext(), "Button clicked again", Toast.LENGTH_SHORT).show();
            }
        });


        // button three long pressed event handler
        Button btnLongPress = findViewById(R.id.btnLongPress);
        btnLongPress.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                System.out.println("Hello the button is pressed long");
                Toast.makeText(getApplicationContext(), "Button Long Pressed", Toast.LENGTH_SHORT).show();
                return true;
            }
        });

        // same method with another click handler type
        btnLongPress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("Hello I am a pressed once");
                Toast.makeText(getApplicationContext(), "Button clicked once", Toast.LENGTH_SHORT).show();
            }
        });


        Button btnSayMyName = findViewById(R.id.btnSayMyName);
        btnSayMyName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // declare the EditText and TextView
                EditText edtTxtName = findViewById(R.id.edtTxtName);
                TextView txtName = findViewById(R.id.txtName);

                // assign the text from edit text to the textview
                txtName.setText("Name: " + edtTxtName.getText().toString());
                Toast.makeText(getApplicationContext(), "Well done " + edtTxtName.getText().toString(), Toast.LENGTH_SHORT).show();
            }
        });




    }
}