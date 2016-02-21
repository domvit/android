package com.oleg.myapplication2.app;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by HiMan on 11.02.2016.
 */
public class MainActivity extends Activity {

    private TextView textView;
    private Button button_two;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout);

        textView = (TextView) findViewById(R.id.textView);
        button_two = (Button) findViewById(R.id.button2);

        button_two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("Москаль отримав по яйцю.");
            }
        });
    }

    public void clicBtn(View view){
        textView.setText("Москаль отримав в око.");
    }
}
