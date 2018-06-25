package com.example.jcarlos.nicolsrest_v3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main4Activity extends AppCompatActivity {
private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
    button =(Button)findViewById(R.id.contacto);
    }
    public void onClick(View view) {
        Intent intent= new Intent(Main4Activity.this,Main3Activity.class);
        startActivity(intent);
        finish();
    }
}
