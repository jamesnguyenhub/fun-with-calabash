package com.tuyenmonkey.democalabash.presentation.login;

import android.os.Bundle;
import android.text.TextUtils;
import android.widget.EditText;

import com.tuyenmonkey.democalabash.R;
import com.tuyenmonkey.democalabash.base.BaseFragment;
import com.tuyenmonkey.democalabash.presentation.MainActivity;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * Created by Tuyen Nguyen on 6/29/16.
 */
public class LoginFragment extends BaseFragment {

    private static final String TAG = "LoginFragment";

    @BindView(R.id.etUsername) EditText etUsername;
    @BindView(R.id.etPassword) EditText etPassword;

    public static LoginFragment newInstance() {
        Bundle args = new Bundle();
        LoginFragment fragment = new LoginFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_login;
    }

    @OnClick(R.id.btLogin)
    public void onLoginButtonClicked() {
        String username = etUsername.getText().toString();
        String password = etPassword.getText().toString();

        if (TextUtils.isEmpty(username)) {
            showToast("Please input username");
            return;
        }

        if (TextUtils.isEmpty(password)) {
            showToast("Please input password");
            return;
        }

        if (password.equals("123")) {
            MainActivity.start(getContext());
            getActivity().finish();
        } else {
            showToast("Wrong password");
        }
    }
}
