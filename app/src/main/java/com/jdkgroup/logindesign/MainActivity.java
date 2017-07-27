package com.jdkgroup.logindesign;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatButton;
import android.view.View;

import com.jdkgroup.logindesign.bubblealertview.BubbleAlertViewActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private AppCompatButton btnAppBubbleAlertView, btnAppLoginA, btnAppLoginB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAppBubbleAlertView = (AppCompatButton) findViewById(R.id.btnAppBubbleAlertView);
        btnAppLoginA = (AppCompatButton) findViewById(R.id.btnAppLoginA);
        btnAppLoginB = (AppCompatButton) findViewById(R.id.btnAppLoginB);

        btnAppBubbleAlertView.setOnClickListener(this);
        btnAppLoginA.setOnClickListener(this);
        btnAppLoginB.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnAppBubbleAlertView:
                launch(BubbleAlertViewActivity.class);
                break;

            case R.id.btnAppLoginA:
                launch(LoginAActivity.class);
                break;

            case R.id.btnAppLoginB:
                launch(LoginBActivity.class);
                break;
        }
    }

    protected void launch(Class<?> classType) {
        Intent intent = new Intent(this, classType);
        intent.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
        startActivity(intent);
    }
}
