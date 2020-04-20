package com.u1065138.toggleapp;

import android.graphics.Color;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener {


      private ImageView img_bulb_on,img_bulb_off;
      private ConstraintLayout constraintLayout;
      private ToggleButton toggleButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        img_bulb_on = findViewById(R.id.img_bulb_on);
        img_bulb_off = findViewById(R.id.img_bulb_off);
        constraintLayout=findViewById(R.id.layout);
        toggleButton=findViewById(R.id.toggleButton);

        toggleButton.setOnCheckedChangeListener(this);
        constraintLayout.setBackgroundColor(Color.parseColor("#FFFF33"));
        img_bulb_off.setVisibility(View.INVISIBLE);
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        if(isChecked){
            constraintLayout.setBackgroundColor(Color.parseColor("#000000"));
            img_bulb_off.setVisibility(View.VISIBLE);
            img_bulb_on.setVisibility(View.INVISIBLE);
        }else{
            constraintLayout.setBackgroundColor(Color.parseColor("#FFFF33"));
            img_bulb_off.setVisibility(View.INVISIBLE);
            img_bulb_on.setVisibility(View.VISIBLE);
        }

    }
}
