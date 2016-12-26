package com.iweather.android.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.view.LayoutInflater;
import android.view.View;

import java.util.List;

/**
 * Created by asus1 on 2016/12/7.
 */

public class FragAdapter extends FragmentPagerAdapter {

    private List<Fragment> mFragments;

    private String[] tabtitle ;

    public FragAdapter(FragmentManager fm, List<Fragment> mFragments, String[] tabtitle) {
        super(fm);
        this.mFragments = mFragments;
        this.tabtitle = tabtitle;
    }

    @Override
    public Fragment getItem(int position) {
        return mFragments.get(position);
    }

    @Override
    public int getCount() {
        return mFragments.size();
    }
    @Override
    public CharSequence getPageTitle(int position) {
        return tabtitle[position];
    }
}
