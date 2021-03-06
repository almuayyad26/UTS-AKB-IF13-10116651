package com.mim.uts_akb_if13_10116651;

import android.support.v4.view.PagerAdapter;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class CustomPagerAdapter extends PagerAdapter {
    //10116651-Muhamad Iyad Muayyad-IF13

    private Context mContext;

    public CustomPagerAdapter(Context context) {
        mContext = context;
    }

    @Override
    public Object instantiateItem(ViewGroup collection, int position) {

        ModelAdapter modelAdapter = ModelAdapter.values()[position];
        LayoutInflater inflater = LayoutInflater.from(mContext);
        ViewGroup layout = (ViewGroup) inflater.inflate(modelAdapter.getLayoutResId(), collection, false);
        collection.addView(layout);
        return layout;
    }

    @Override
    public void destroyItem(ViewGroup collection, int position, Object view) {
        collection.removeView((View) view);
    }

    @Override
    public int getCount() {
        return ModelAdapter.values().length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        ModelAdapter customPagerEnum = ModelAdapter.values()[position];
        return mContext.getString(customPagerEnum.getTitleResId());
    }
}
