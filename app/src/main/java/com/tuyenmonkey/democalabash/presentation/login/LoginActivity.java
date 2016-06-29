package com.tuyenmonkey.democalabash.presentation.login;

import android.content.Context;
import android.content.Intent;

import com.tuyenmonkey.democalabash.R;
import com.tuyenmonkey.democalabash.base.BaseActivity;

/**
 * Created by Tuyen Nguyen on 6/29/16.
 */
public class LoginActivity extends BaseActivity {

    private static final String TAG = "LoginActivity";

    public static void start(Context context) {
        context.startActivity(new Intent(context, LoginActivity.class));
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_login;
    }
}
