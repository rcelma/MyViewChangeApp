package com.mobileappscompany.training.myviewchangeapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private View.OnClickListener fieldButtonListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(MainActivity.this, FieldsActivity.class);
            startActivity(i);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button scrollButton = (Button)findViewById(R.id.button2);
        scrollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, ScrollingActivity.class);
                startActivity(i);
            }
        });

        Button toastButton = (Button)findViewById(R.id.button3);
        toastButton.setOnClickListener(this);

        Button fieldsButton = (Button)findViewById(R.id.button4);
        fieldsButton.setOnClickListener(fieldButtonListener);
    }

    public void displaySlideView(View view) {
        Intent i = new Intent(this, SlideActivity.class);
        startActivity(i);
    }

    @Override
    public void onClick(View v) {
        showToastMessage(getString(R.string.toast_message));
    }

    private void showToastMessage(String msg){
        Toast toast = Toast.makeText(this, msg, Toast.LENGTH_SHORT);
        toast.show();
    }
}
