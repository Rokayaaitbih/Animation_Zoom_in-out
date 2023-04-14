package com.example.animation_zoom_in_out;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView text;
    Animation anim;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text=(TextView)findViewById(R.id.text);
        anim= AnimationUtils.loadAnimation(this,R.anim.scale);


        text.setAnimation(anim);
    }
}