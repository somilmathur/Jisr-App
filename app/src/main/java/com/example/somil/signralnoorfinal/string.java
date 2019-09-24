package com.example.somil.signralnoorfinal;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class string extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();




        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_string);


        Spinner To = (Spinner) findViewById(R.id.To);
        Spinner From = (Spinner) findViewById(R.id.From);

        ArrayAdapter adapter = ArrayAdapter.createFromResource(this, R.array.To, R.layout.spinner_item);
        adapter.setDropDownViewResource(R.layout.spinner_dropdown_item);

        ArrayAdapter adapter1 = ArrayAdapter.createFromResource(this, R.array.From, R.layout.spinner_item);
        adapter1.setDropDownViewResource(R.layout.spinner_dropdown_item);
        To.setAdapter(adapter);
        From.setAdapter(adapter1);

        EditText edit_txt = (EditText) findViewById(R.id.search_edit);

        /*edit_txt.setOnEditorActionListener(new EditText.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                if (actionId == EditorInfo.IME_ACTION_DONE) {
                    Toast.makeText(getApplicationContext(), "Shit works!", Toast.LENGTH_LONG).show();

                    return true;
                }
                return false;
            }
        });*/


        Button back = (Button) findViewById(R.id.back);
        back.setOnClickListener(this);
        Button upload = (Button) findViewById(R.id.upload);
        upload.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        switch (view.getId()) {

            case R.id.back:
                Intent i = new Intent(this, MainActivity.class);
                startActivity(i);
                break;

            case R.id.upload:
                Intent LaunchIntent = getPackageManager().getLaunchIntentForPackage("life.knowledge4.videocroppersample");
                startActivity(LaunchIntent);
                break;

    }
}
}

