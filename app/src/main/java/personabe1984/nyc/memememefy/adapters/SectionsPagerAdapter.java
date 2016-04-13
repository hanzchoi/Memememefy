package personabe1984.nyc.memememefy.adapters;

import android.content.Context;
import android.support.v4.app.FragmentPagerAdapter;

import personabe1984.nyc.memememefy.R;

public class SectionsPagerAdapter extends FragmentPagerAdapter {
    Context mContext;

    public SectionsPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment;
        if(position == 0) {
            fragment = new ImageGridFragment();
        } else {
            fragment = new MemeItemFragment();
        }
        return fragment;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if(position == 0) {
            return mContext.getString(R.string.images_fragment_title);
        } else {
            return mContext.getString(R.string.memes_fragment_title);
        }
    }

    @Override
    public int getCount() {
        return 2;
    }
}

