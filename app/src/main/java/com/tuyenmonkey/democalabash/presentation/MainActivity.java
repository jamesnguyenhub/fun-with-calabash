package com.tuyenmonkey.democalabash.presentation;

import android.content.Context;
import android.content.Intent;

import com.tuyenmonkey.democalabash.R;
import com.tuyenmonkey.democalabash.base.BaseActivity;

public class MainActivity extends BaseActivity {

    public static void start(Context context) {
        context.startActivity(new Intent(context, MainActivity.class));
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }
}
