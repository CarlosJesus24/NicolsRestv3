package com.example.jcarlos.nicolsrest_v3;

import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    private ViewPager viewPager;
    private SliderAdapter myadapter;
    private TextView[] ndots;
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        viewPager = (ViewPager) findViewById(R.id.viewpager);
        myadapter = new SliderAdapter(this);
        viewPager.setAdapter(myadapter);
        textView = (TextView)findViewById(R.id.finalizar);


    }
        public void onClick(View view) {
            Intent intent= new Intent(Main2Activity.this,Main3Activity.class);
            startActivity(intent);
            finish();
        }

}
