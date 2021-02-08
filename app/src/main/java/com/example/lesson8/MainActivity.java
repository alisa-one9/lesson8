package com.example.lesson8;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.res.Configuration;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity  implements IFragments{
    private FragmentManager fragmentManager;
    private FragmentTransaction transaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fragmentManager = getSupportFragmentManager();
        transaction = fragmentManager.beginTransaction();
        transaction.add(R.id.fragment_first,new ChangeFragment());
        transaction.commit();
    }

    @Override
    public void displayDetails(String title, String subTitle, int imageView) {
        if(getResources().getConfiguration().orientation== Configuration.ORIENTATION_LANDSCAPE){
            fragmentManager =getSupportFragmentManager();
            transaction =fragmentManager.beginTransaction();
            transaction.replace(R.id.fragment_second,TextFragment.newInstance(title,subTitle,imageView));
        }

    }
}