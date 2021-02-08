package com.example.lesson8;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class TextFragment extends Fragment {
    private static final String KEY1 = "key1";
    private static final String KEY2 = "key2";
    private static final String KEY3 = "key3";
    private String txt;
    private String txtSub;
    private int img;
    private TextView textView, textSubTitle;
    private ImageView imageView;

    public TextFragment() {
    }

    public static TextFragment newInstance(String param1, String param2, int param3) {
        TextFragment fragment = new TextFragment();
        Bundle args = new Bundle();
        args.putString(KEY1, param1);
        args.putString(KEY2, param2);
        args.putInt(KEY3, param3);
        fragment.setArguments(args);
        return fragment;

    }
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            txt = getArguments().getString(KEY1);
            txtSub = getArguments().getString(KEY2);
            img = getArguments().getInt(KEY3);
        }
    }
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        android.view.View view = inflater.inflate(R.layout.fragment_text, container, false);
        textView = view.findViewById(R.id.txtView);
        textSubTitle = view.findViewById(R.id.txtSubTitle);
        imageView = view.findViewById(R.id.avatarView);
        textView.setText(txt);
        textSubTitle.setText(txtSub);
        imageView.setImageResource(img);
        return view;
    }
}



