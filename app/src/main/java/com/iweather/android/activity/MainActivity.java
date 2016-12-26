package com.iweather.android.activity;

import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.iweather.android.R;
import com.iweather.android.adapter.FragAdapter;
import com.iweather.android.activity.fragment.AttentionFragment;
import com.iweather.android.activity.fragment.HomeFragment;
import com.iweather.android.activity.fragment.SetFragment;
import com.luseen.luseenbottomnavigation.BottomNavigation.BottomNavigationView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private BottomNavigationView bottomNavigationView;
    private ViewPager mViewPager;
    private ArrayList<Fragment> fragmentList;
    private FragAdapter fragadapter;
    private String[] tabtitle = new String[]{"天气", "关注", "设置"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        InitViewPager();
        initNavigationView();
    }

    /*
  * 初始化ViewPager
  */
    public void InitViewPager() {
        mViewPager = (ViewPager) findViewById(R.id.viewpager);

        fragmentList = new ArrayList<Fragment>();
        fragmentList.add(new HomeFragment());
        fragmentList.add(new AttentionFragment());
        fragmentList.add(new SetFragment());
        fragadapter = new FragAdapter(getSupportFragmentManager(), fragmentList, tabtitle);
        //给ViewPager设置适配器
        mViewPager.setAdapter(fragadapter);
        //设置不可左右滑动
       /* mViewPager.setOnTouchListener( new View.OnTouchListener()
        {
            @Override
            public boolean onTouch(View v, MotionEvent event)
            {
                return true;
            }
        });*/
        //滑动监听
        mViewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
            }
            @Override
            public void onPageSelected(int position) {
                //设置导航栏按钮的位置
                bottomNavigationView.selectTab(position);
            }
            @Override
            public void onPageScrollStateChanged(int state) {
            }
        });
    }

    /**
     * 初始化导航栏
     */
    private void initNavigationView() {
        bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottomNavigation);
        //设置隐藏文字,点击时才显示,默认true
        bottomNavigationView.isWithText(false);
        //设置为竖屏,一般用于pad(默认横屏)
        // bottomNavigationView.activateTabletMode();
        //设置是否启用导航栏背景,默认为true
        // bottomNavigationView.isColoredBackground(false);
        //设置禁用影子
        //bottomNavigationView.disableShadow();
        //You can disable slide animation when using viewPager
        //bottomNavigationView.disableViewPagerSlide();
        //字体大小设置
        bottomNavigationView.setTextActiveSize(getResources().getDimension(R.dimen.text_active));
        bottomNavigationView.setTextInactiveSize(getResources().getDimension(R.dimen.text_inactive));


        int[] image = {R.drawable.tab_home, R.drawable.tab_attention, R.drawable.tab_set};
        int[] color = {ContextCompat.getColor(this, R.color.firstColor),
                ContextCompat.getColor(this, R.color.secondColor),
                ContextCompat.getColor(this, R.color.fourthColor)};

        bottomNavigationView.setUpWithViewPager(mViewPager, color, image);
    }
}
