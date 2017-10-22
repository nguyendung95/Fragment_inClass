package com.example.hoshiko.fragment_inclass;

import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
//        fragmentTransaction.add(R.id.fragment_content, new MainFragment());
//        fragmentTransaction.commit();
        viewPager = (ViewPager) findViewById(R.id.view_pager);
        viewPager.setAdapter(new MyPagerAdapter(getSupportFragmentManager()));

    }

}
