package com.example.somil.signralnoorfinal;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button sign2text, text2sign;

        sign2text = (Button) findViewById(R.id.sign2text);
        text2sign = (Button) findViewById(R.id.text2sign);

        sign2text.setOnClickListener(this);
        text2sign.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {

        switch (view.getId()) {

            case R.id.text2sign:
                Intent i = new Intent(this, string.class);
                startActivity(i);
                break;

            case R.id.sign2text:
                Intent LaunchIntent = getPackageManager().getLaunchIntentForPackage("com.example.newdemo");
                startActivity(LaunchIntent);
                break;


        }
    }

}
