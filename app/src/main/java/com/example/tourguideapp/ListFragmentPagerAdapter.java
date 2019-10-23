package com.example.tourguideapp;

import android.content.Context;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

class ListFragmentPagerAdapter extends FragmentPagerAdapter {

    private Context context;


    ListFragmentPagerAdapter(Context context, FragmentManager fm) {

        super(fm);
        this.context = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new MainActivityFragment();
        } else if (position == 1) {
            return new PyramidsFragment();
        } else if (position == 2) {
            return new AzharParkFragment();
        } else if (position == 3) {
            return new CairoTowerFragment();
        } else {
            return new NileFragment();
        }
    }

    @Override
    public int getCount() {
        return 5;
    }


    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return context.getString(R.string.main_view);
        } else if (position == 1) {
            return context.getString(R.string.pyramids);
        } else if (position == 2) {
            return context.getString(R.string.azher_park);
        } else if (position == 3) {
            return context.getString(R.string.cairo_tower);
        } else {
            return context.getString(R.string.nile);
        }
    }

}


