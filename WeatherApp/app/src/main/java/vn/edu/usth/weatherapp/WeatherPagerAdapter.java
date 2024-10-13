package vn.edu.usth.weatherapp;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class WeatherPagerAdapter extends FragmentPagerAdapter {

    public WeatherPagerAdapter(@NonNull FragmentManager fm) {
        super(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return WeatherFragment.newInstance("Hanoi");
            case 1:
                return WeatherFragment.newInstance("Paris");
            default:
                return WeatherFragment.newInstance("Toulouse");
        }
    }

    @Override
    public int getCount() {
        return 3; // Number of tabs
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "HANOI";
            case 1:
                return "PARIS";
            default:
                return "TOULOUSE";
        }
    }
}
