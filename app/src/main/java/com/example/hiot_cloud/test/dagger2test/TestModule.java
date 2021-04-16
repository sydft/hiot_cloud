package com.example.hiot_cloud.test.dagger2test;

import dagger.Module;
import dagger.Provides;

/**
 * dagger2测试module
 */
@Module
public class TestModule {

    @Provides
    public ThirdObj getThirdObj() { return new ThirdObj(); }
}
