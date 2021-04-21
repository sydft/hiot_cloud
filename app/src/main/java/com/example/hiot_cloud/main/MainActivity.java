package com.example.hiot_cloud.main;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.example.hiot_cloud.R;
import com.example.hiot_cloud.base.BaseActivity;
import com.example.hiot_cloud.base.BasePresenter;
import com.example.hiot_cloud.utils.Constans;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //设置Viewpager
        ViewPager vpMain = findViewById(R.id.vp_main);
        vpMain.setAdapter(new MainViewPagerAdapter());
        vpMain.setOffscreenPageLimit(Constans.MAIN_FRAGMENT_COUNT);

        RadioGroup rgMain = findViewById(R.id.rg_main);
        rgMain.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
               switch (checkedId){
                   case R.id.rb_message:
                       vpMain.setCurrentItem(Constans.MAIN_VIEWPAGER_INDE_MESSAGE);
                       break;
                   case R.id.rb_equipment:
                       vpMain.setCurrentItem(Constans.MAIN_VIEWPAGER_INDE_EQUIPMENT);
                       break;
                   case R.id.rb_scene:
                       vpMain.setCurrentItem(Constans.MAIN_VIEWPAGER_INDE_SCENE);
                       break;
                   case R.id.rb_mine:
                       vpMain.setCurrentItem(Constans.MAIN_VIEWPAGER_INDE_MINE);
                       break;
                   default:
               }
            }
        });
    }

    @Override
    public BasePresenter createPresenter() {
        return null;
    }

    @Override
    public void injectIndependies() {
        getActivityComponent().inject(this);
    }
}