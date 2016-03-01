package com.domvit.android.androidlesson9activityresultexam.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.domvit.android.androidlesson9activityresultexam.R;
import com.domvit.android.androidlesson9activityresultexam.utils.Language;

/**
 * Created by HiMan on 01.03.2016.
 */
public class LanguageActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.language_layout);
    }

    public void onLanguage(View v){
        Intent intent = new Intent();
        String language = "не определен";
        switch (v.getId()){
            case R.id.btnEnglish:
                language = Language.ENGLISH.getLanguage();
                break;
            case R.id.btnUkraine:
                language = Language.UKRAINIAN.getLanguage();
                break;
            case R.id.btnRussian:
                language = Language.RUSSIAN.getLanguage();
                break;
        }
        intent.putExtra("language",language);
        setResult(RESULT_OK, intent);
        finish();
    }
}
