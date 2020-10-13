package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void goToActivity(View view) {
        EditText username = findViewById(R.id.username);
        EditText password = findViewById(R.id.password);
        String str = getIntent().getStringExtra("msg");
        if (username.getText().toString().equals("User123") && password.getText().toString().equals("User123")) {
            Log.i("INFO", "Transitioning to" + UserConfirmationActivity.class.getName());
            Intent intent = new Intent(getApplicationContext(), UserConfirmationActivity.class);
            intent.putExtra("msg", "Welcome " + username.getText());
            startActivity(intent);
        } else {
            Log.i("INFO", "Transitioning to" + UserConfirmationActivity.class.getName());
            Intent intent = new Intent(getApplicationContext(), UserConfirmationActivity.class);
            intent.putExtra("msg", "Wrong Username/password provided ");
            startActivity(intent);
        }
    }


}