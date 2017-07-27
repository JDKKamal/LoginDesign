package com.jdkgroup.logindesign;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.AppCompatTextView;
import android.view.View;

public class LoginAActivity extends AppCompatActivity implements View.OnClickListener {

    private AppCompatTextView tvCreateAccountLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_a_activity);

        tvCreateAccountLogin = (AppCompatTextView) findViewById(R.id.tvCreateAccountLogin);

        tvCreateAccountLogin.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId())
        {
            case R.id.tvCreateAccountLogin:
                launch(CreateAccountActivity.class);
                break;
        }
    }

    protected void launch(Class<?> classType) {
        Intent intent = new Intent(this, classType);
        intent.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
        startActivity(intent);
    }
}
