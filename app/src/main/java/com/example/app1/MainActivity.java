package com.example.app1;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void sayHello(View view){
        Log.i("INFO", "Hello Android!");
        TextView tv = findViewById(R.id.textView);
        tv.setText("Hello Android!");

    }
}