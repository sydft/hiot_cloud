package com.example.hiot_cloud.test.mvptest;

import com.example.hiot_cloud.base.BasePresenter;
import com.example.hiot_cloud.test.mvptest.model.User;

import javax.inject.Inject;

public class TestPresenter extends BasePresenter<TestView> {

    @Inject
    public TestPresenter() {
    }

    public void login(User user){
        if ("list".equals(user.getUserName()) && "123".equals(user.getPassword())){
            getView().showMessage("登录成功");
        }else {
            getView().showMessage("登录失败");
        }
    }
}
