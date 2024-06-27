package com.example.animationapplicationex_3;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity
{

    ImageView image;

    Button start;
    Button stop;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


            image=findViewById(R.id.img1);
            start=findViewById(R.id.btn1);
            stop=findViewById(R.id.btn2);

            Animation startAnimation= AnimationUtils.loadAnimation(this,R.anim.start);

            start.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    image.startAnimation(startAnimation);
                }
            });

            stop.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    image.clearAnimation();
                }
            });
    }
}
