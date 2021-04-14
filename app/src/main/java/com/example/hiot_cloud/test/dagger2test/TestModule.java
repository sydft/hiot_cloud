package com.example.hiot_cloud.test.dagger2test;

import dagger.Provides;

public class TestModule {

    @Provides
    public ThirdObj getThirdObj(){
        return new ThirdObj();
    }
}
