package com.arifah.kitalulussimple;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.Window;
import android.view.animation.AlphaAnimation;
import android.widget.ImageView;

public class SplashScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_UNSPECIFIED);
        splash_screen();
    }


    public void splash_screen(){
        ImageView logo = findViewById(R.id.logo_splash);
        AlphaAnimation animaton1 = new AlphaAnimation(0.0f, 1.0f);
        animaton1.setDuration(1000);
        animaton1.setStartOffset(1000);

        logo.startAnimation(animaton1);
        Thread timerThread = new Thread() {
            public void run () {
                try{
                    sleep(3000);
                } catch (InterruptedException e){
                    e.printStackTrace();
                }finally {

                    Intent intent = new Intent(SplashScreenActivity.this, Main2Activity.class);
                    startActivity(intent);
                    finish();

                }
            }
        };
        timerThread.start();
    }
}
