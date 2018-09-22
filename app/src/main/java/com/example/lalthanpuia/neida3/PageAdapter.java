package com.example.lalthanpuia.neida3;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class PageAdapter extends FragmentStatePagerAdapter {
    int mNumOfTabs;
    public PageAdapter(FragmentManager fm, int NumOfTabs) {
        super(fm);
        this.mNumOfTabs = NumOfTabs;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                thingfanghma_natna_landan tab1 = new thingfanghma_natna_landan();
                return tab1;
            case 1:
                thingfanghma_nantna_enkawldan tab2 = new thingfanghma_nantna_enkawldan();
                return tab2;

            default:
                return null;
        }    }

    @Override
    public int getCount() {
        return mNumOfTabs;
    }
}
