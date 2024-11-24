package com.example.project3;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void displayImage1(View v){
        ImageView image = findViewById(R.id.imageView);
        Animation animFadeOut = AnimationUtils.loadAnimation(this, R.anim.fadeout);
        Animation animFadeIn = AnimationUtils.loadAnimation(this, R.anim.fadein);

        animFadeOut.reset();
        image.clearAnimation();
        image.startAnimation(animFadeOut);

        image.setImageResource(R.drawable.turtwig);

        animFadeIn.reset();
        image.clearAnimation();
        image.startAnimation(animFadeIn);

    }

    public void displayImage2(View v){
        ImageView image = findViewById(R.id.imageView);
        Animation animFadeOut = AnimationUtils.loadAnimation(this, R.anim.fadeout);
        Animation animFadeIn = AnimationUtils.loadAnimation(this, R.anim.fadein);

        animFadeOut.reset();
        image.clearAnimation();
        image.startAnimation(animFadeOut);

        image.setImageResource(R.drawable.chimchar);

        animFadeIn.reset();
        image.clearAnimation();
        image.startAnimation(animFadeIn);
    }

    public void displayImage3(View v){
        ImageView image = findViewById(R.id.imageView);
        Animation animFadeOut = AnimationUtils.loadAnimation(this, R.anim.fadeout);
        Animation animFadeIn = AnimationUtils.loadAnimation(this, R.anim.fadein);

        animFadeOut.reset();
        image.clearAnimation();
        image.startAnimation(animFadeOut);

        image.setImageResource(R.drawable.piplup);

        animFadeIn.reset();
        image.clearAnimation();
        image.startAnimation(animFadeIn);
    }
}