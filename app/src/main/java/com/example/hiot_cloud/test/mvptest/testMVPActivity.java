package com.example.hiot_cloud.test.mvptest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.hiot_cloud.R;
import com.example.hiot_cloud.base.BaseActivity;
import com.example.hiot_cloud.test.mvptest.model.User;

public class testMVPActivity extends BaseActivity<TestView, TestPresenter> implements TestView{

    private TestPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        presenter = new TestPresenter();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_mvp);
        EditText etUserName = findViewById(R.id.tv_user_name);
        EditText etPassword = findViewById(R.id.tv_password);
        Button btnLogin = findViewById(R.id.btn_login);
        User user = new User();
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                user.setUserName(etUserName.getText().toString());
                user.setPassword(etPassword.getText().toString());
                presenter.login(user);
            }
        });
    }

    @Override
    public TestPresenter createPresenter() {
        return presenter;
    }

    @Override
    public void showMessage(String msg) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }
}