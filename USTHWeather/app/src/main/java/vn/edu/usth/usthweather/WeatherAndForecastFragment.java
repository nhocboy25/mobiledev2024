package vn.edu.usth.usthweather;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentManager;



public class WeatherAndForecastFragment extends Fragment {

    public WeatherAndForecastFragment() {
        // Required empty public constructor
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_weather_and_forecast, container, false);

        // Initialize the fragments
        FragmentManager fragmentManager = getChildFragmentManager();

        Fragment weatherFragment = new WeatherFragment();
        Fragment forecastFragment = new ForecastFragment();

        // Replace placeholder container views with fragments
        fragmentManager.beginTransaction()
                .replace(R.id.weather_container, weatherFragment)
                .replace(R.id.forecast_container, forecastFragment)
                .commit();

        return view;
    }
}
