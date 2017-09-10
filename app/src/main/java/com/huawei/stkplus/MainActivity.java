package com.huawei.stkplus;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;


/**
 * Created by Coder-pig on 2015/8/28 0028.
 */
public class MainActivity extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener,
        ViewPager.OnPageChangeListener {

    //UI Objects
    private TextView txt_topbar;
    private RadioGroup rg_tab_bar;
    private RadioButton rb_desc;
    private RadioButton rb_help;
    private RadioButton rb_device;
    private RadioButton rb_setting;
    private ViewPager vpager;

    private MyFragmentPagerAdapter mAdapter;

    //几个代表页面的常量
    public static final int PAGE_ONE = 0;
    public static final int PAGE_TWO = 1;
    public static final int PAGE_THREE = 2;
//    public static final int PAGE_FOUR = 3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mAdapter = new MyFragmentPagerAdapter(getSupportFragmentManager());
        bindViews();
        rb_desc.setChecked(true);
    }

    private void bindViews() {
//        txt_topbar = (TextView) findViewById(R.id.txt_topbar);
        rg_tab_bar = (RadioGroup) findViewById(R.id.rg_tab_bar);
        rb_desc = (RadioButton) findViewById(R.id.rb_desc);
        rb_help = (RadioButton) findViewById(R.id.rb_help);
        rb_device = (RadioButton) findViewById(R.id.rb_device);
//        rb_setting = (RadioButton) findViewById(R.id.rb_setting);
        rg_tab_bar.setOnCheckedChangeListener(this);

        vpager = (ViewPager) findViewById(R.id.vpager);
        vpager.setAdapter(mAdapter);
        vpager.setCurrentItem(0);
        vpager.addOnPageChangeListener(this);
    }

    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        switch (checkedId) {
            case R.id.rb_desc:
                vpager.setCurrentItem(PAGE_ONE);
                break;
            case R.id.rb_help:
                vpager.setCurrentItem(PAGE_TWO);
                break;
            case R.id.rb_device:
                vpager.setCurrentItem(PAGE_THREE);
                break;
//            case R.id.rb_setting:
//                vpager.setCurrentItem(PAGE_FOUR);
//                break;
        }
    }


    //重写ViewPager页面切换的处理方法
    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
    }

    @Override
    public void onPageSelected(int position) {
    }

    @Override
    public void onPageScrollStateChanged(int state) {
        //state的状态有三个，0表示什么都没做，1正在滑动，2滑动完毕
        if (state == 2) {
            switch (vpager.getCurrentItem()) {
                case PAGE_ONE:
                    rb_desc.setChecked(true);
                    break;
                case PAGE_TWO:
                    rb_help.setChecked(true);
                    break;
                case PAGE_THREE:
                    rb_device.setChecked(true);
                    break;
//                case PAGE_FOUR:
//                    rb_setting.setChecked(true);
//                    break;
            }
        }
    }
}
