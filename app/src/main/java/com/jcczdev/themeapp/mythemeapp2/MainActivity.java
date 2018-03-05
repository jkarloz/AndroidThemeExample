package com.jcczdev.themeapp.mythemeapp2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.jcczdev.themeapp.mythemeapp2.utils.ThemeUtil;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    ThemeUtil themeUtils;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        themeUtils.onActivityCreateSetTheme(this);
        setContentView(R.layout.activity_main);

        findViewById(R.id.blackbutton).setOnClickListener(this);
        findViewById(R.id.bluebutton).setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch(v.getId()) {
            case R.id.blackbutton:
                themeUtils.changeToTheme(this, themeUtils.BLACK);
                break;
            case R.id.bluebutton:
                themeUtils.changeToTheme(this, themeUtils.BLUE);
                break;
        }
    }
}
