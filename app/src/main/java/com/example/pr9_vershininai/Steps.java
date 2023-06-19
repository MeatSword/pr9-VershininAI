package com.example.pr9_vershininai;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.Map;

public class Steps extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_steps);
    }
    public void onClickStepsActivity(View view) {
        Intent n = new Intent(this, Map.class);
        startActivity(n);
    }
}


