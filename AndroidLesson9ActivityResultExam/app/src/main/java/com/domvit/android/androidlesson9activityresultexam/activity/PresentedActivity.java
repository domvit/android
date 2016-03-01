package com.domvit.android.androidlesson9activityresultexam.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.domvit.android.androidlesson9activityresultexam.R;

/**
 * Created by HiMan on 01.03.2016.
 */
public class PresentedActivity extends Activity {
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.presented_layout);

        editText = (EditText) findViewById(R.id.editName);
    }

    public void onPresented(View v){
        Intent intent = new Intent();
        intent.putExtra("name",editText.getText().toString());
        setResult(RESULT_OK,intent);
        finish();
    }
}
