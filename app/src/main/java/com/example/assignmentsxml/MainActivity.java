package com.example.assignmentsxml;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;



public class MainActivity extends Activity{

    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState){

        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout);
        imageView = (ImageView) findViewById(R.id.image);
        final Animation animTransRight = AnimationUtils
                .loadAnimation(this, R.anim.rotate_animation);
        final Animation animTransLeft = AnimationUtils.loadAnimation(
                this, R.anim.slide_down_animation);
        Button btn = (Button) findViewById(R.id.btns);
        Button btnl = (Button) findViewById(R.id.btnls);

        btn.setOnClickListener(new OnClickListener() {
            @Override

            public void onClick(View view) {
                imageView.startAnimation(animTransRight);

            }
        });
        btnl.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView.startAnimation(animTransLeft);
            }
        });

    }
}
