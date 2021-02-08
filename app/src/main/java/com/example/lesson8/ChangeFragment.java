package com.example.lesson8;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ChangeFragment extends Fragment implements  IFragments{
    private ArrayList<MainModel>list;
    private RecyclerView recyclerView;
    private RecyclerAdapter adapter;






    @Override
    public void displayDetails(String title, String subTitle, int imageView) {

    }
}
