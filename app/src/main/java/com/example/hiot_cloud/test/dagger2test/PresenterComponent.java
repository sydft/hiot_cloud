package com.example.hiot_cloud.test.dagger2test;

import com.example.hiot_cloud.test.mvptest.TestMVPActivity;

import dagger.Component;

/**
 * 测试注入器接口
 */
@Component
public interface PresenterComponent {

    void inject(TestMVPActivity testMVPActivity);
}
