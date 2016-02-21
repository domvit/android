package com.oleg.myapplication3.app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by HiMan on 17.02.2016.
 */
public class MainActivity extends Activity {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToSecondActivity(v);
            }
        });

    }
    public void goToSecondActivity(View v){
        Intent intent = new Intent(this,SecondActivity.class);
        startActivity(intent);
    }
}
