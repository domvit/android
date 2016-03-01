package com.domvit.android.androidlesson9activityresultexam.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.domvit.android.androidlesson9activityresultexam.R;
import com.domvit.android.androidlesson9activityresultexam.utils.RequestCode;

/**
 * Created by HiMan on 01.03.2016.
 */
public class MainActivity extends Activity{
    private TextView txtName;
    private TextView txtLanguage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout);

        txtName = (TextView) findViewById(R.id.txtName);
        txtLanguage = (TextView) findViewById(R.id.txtLanguage);
    }

    public void onShow(View v){
        Intent intent;
        switch (v.getId()){
            case R.id.btnPresented:
                intent = new Intent(getApplicationContext(),PresentedActivity.class);
                startActivityForResult(intent, RequestCode.REQUEST_CODE_PRESENTED);
                break;
            case R.id.btnLanguage:
                intent = new Intent(getApplicationContext(),LanguageActivity.class);
                startActivityForResult(intent, RequestCode.REQUEST_CODE_LANGUAGE);
                break;
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (resultCode == RESULT_OK){
            switch (requestCode){
                case RequestCode.REQUEST_CODE_PRESENTED:
                    String name = data.getStringExtra("name");
                    txtName.setText("Ваше имя "+name);
                    break;
                case RequestCode.REQUEST_CODE_LANGUAGE:
                    String language = data.getStringExtra("language");
                    txtLanguage.setText("Ваш язык "+language);
                    break;
            }
        }else{
            Toast.makeText(getApplicationContext(),"ERROR",Toast.LENGTH_LONG).show();
        }
    }
}
