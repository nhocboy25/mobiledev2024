package vn.edu.usth.usthweather;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class ViewPagerAdapter extends FragmentPagerAdapter {

    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public int getCount() {
        return 3;
    }

    @NonNull
    @Override
    public Fragment getItem(int page) {
        switch (page) {
            case 0: return new WeatherAndForecastFragment();
            case 1: return new WeatherAndForecastFragment();
            case 2: return new WeatherAndForecastFragment();
        }
        return new ForecastFragment();
    }

    @Override
    public CharSequence getPageTitle(int page) {
        final String[] titles = new String[] { "Hanoi , Vietnam ", "Berlin , Germany", "Toulouse , France" };
        return titles[page];
    }

    public void addFragment(WeatherAndForecastFragment weatherAndForecastFragment) {
    }
}