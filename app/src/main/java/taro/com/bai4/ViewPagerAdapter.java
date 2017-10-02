package taro.com.bai4;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by VjrutNAT on 10/2/2017.
 */

public class ViewPagerAdapter extends FragmentPagerAdapter {

    private Context mContext;



    public ViewPagerAdapter(FragmentManager fm, Context context) {
        super(fm);
        this.mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment;
        switch (position){
            case 0:
                fragment = new FragmentBai1();
                break;
            case 1:
                fragment = new FragmentBai2();
                break;
            case 2:
                fragment = new FragmentBai4();
                break;
            default:
                fragment = new FragmentBai1();
                break;
        }
        return fragment;
    }

    @Override
    public int getCount() {
        return 3;
    }


    @Override
    public CharSequence getPageTitle(int position) {
        String pageTitle = mContext.getString(R.string.bai1);
        switch (position) {
            case 0:
                pageTitle = mContext.getString(R.string.bai1);
                break;
            case 1:
                pageTitle = mContext.getString(R.string.bai2);
                break;
            case 2:
                pageTitle = mContext.getString(R.string.bai4);
                break;
            default:
                pageTitle = mContext.getString(R.string.bai1);
                break;
        }

        return pageTitle;
    }

}
