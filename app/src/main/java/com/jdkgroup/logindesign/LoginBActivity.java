package com.jdkgroup.logindesign;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.AppCompatTextView;
import android.view.View;

import com.jdkgroup.logindesign.CreateAccountActivity;
import com.jdkgroup.logindesign.R;

public class LoginBActivity extends AppCompatActivity implements View.OnClickListener {

    private AppCompatTextView tvAppCreateAccount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_b_activity);

        tvAppCreateAccount = (AppCompatTextView) findViewById(R.id.tvAppCreateAccount);

        tvAppCreateAccount.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId())
        {
            case R.id.tvAppCreateAccount:
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
