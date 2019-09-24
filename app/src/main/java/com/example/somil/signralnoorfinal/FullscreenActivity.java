
package com.example.somil.signralnoorfinal;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.CountDownTimer;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import static com.example.somil.signralnoorfinal.R.styleable.ActionBar;

public class FullscreenActivity extends AppCompatActivity {

    private ImageView iv;
    private ProgressBar pb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        setContentView(R.layout.activity_fullscreen);


        iv = (ImageView) findViewById(R.id.logo);

        pb = (ProgressBar) findViewById(R.id.progressBar);
        pb.setVisibility(View.INVISIBLE);

        new CountDownTimer(2000, 1000) {
            public void onFinish() {
                pb.setVisibility(View.VISIBLE);
            }

            public void onTick(long millisUntilFinished) {
                // millisUntilFinished    The amount of time until finished.
            }
        }.start();



        Animation myanim = AnimationUtils.loadAnimation(this,R.anim.mytransition);
        Animation myanimlogo = AnimationUtils.loadAnimation(this,R.anim.forlogo);

        iv.startAnimation(myanim);

        final Intent i = new Intent(this, MainActivity.class);

        Thread timer = new Thread(){

            public void run(){


                try {
                    sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                finally{
                    startActivity(i);
                    finish();
                }
            }
        };

            timer.start();

    }


}
