package com.example.guessmachine;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    int n;
    public void guess(View view){
        EditText campnou=(EditText)findViewById(R.id.editTextNumber);
        int testare=Integer.parseInt(campnou.getText().toString());
        String message;
        if(testare>n)
        {
            message="Lower";
            Toast.makeText(this,message,Toast.LENGTH_SHORT).show();
        }
        else if(testare<n)
        {
            message="Higher";
            Toast.makeText(this,message,Toast.LENGTH_SHORT).show();
        }
        else {
            message = "you got it";
            Toast.makeText(this,message,Toast.LENGTH_SHORT).show();
            Random generator=new Random();
            n=generator.nextInt(20)+1;
        }
        Log.i("Info",Integer.toString(n));
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Random generator=new Random();
        n=generator.nextInt(20)+1;
    }
}