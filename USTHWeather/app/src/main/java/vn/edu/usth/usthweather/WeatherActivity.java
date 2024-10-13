package vn.edu.usth.usthweather;

import android.os.Bundle;
import android.util.Log;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

public class WeatherActivity extends AppCompatActivity {

    private static final String TAG = "WeatherActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                try{
                    Thread.sleep(5000);
                }
                catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        t.start();
        super.onCreate(savedInstanceState);
        Log.i(TAG, "onCreate() called");

        // Set the content view to the layout containing the container (FrameLayout)
        setContentView(R.layout.activity_weather);

        // Create an instance of ForecastFragment
        ForecastFragment forecastFragment = new ForecastFragment();

        // Begin the transaction to add the fragment
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();

        // Add the ForecastFragment to the container (FrameLayout with id 'container')
        transaction.add(R.id.main, forecastFragment);


        transaction.commit();
        ViewPager viewPager = findViewById(R.id.viewPager);

        TabLayout tabLayout = findViewById(R.id.tab_Layout);
        tabLayout.setupWithViewPager(viewPager);
        // Commit the transaction
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        viewPager.setOffscreenPageLimit(3);
        viewPager.setAdapter(adapter);
        // Add three instances of WeatherAndForecastFragment to the adapter
        for (int i = 0; i < 3; i++) {
            adapter.addFragment(new WeatherAndForecastFragment());
        }

        viewPager.setAdapter(adapter);
    }


    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "onStart() called");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "onResume() called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "onPause() called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "onStop() called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "onDestroy() called");
    }
}
