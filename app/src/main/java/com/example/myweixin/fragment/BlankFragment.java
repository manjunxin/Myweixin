package com.example.myweixin.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.example.myweixin.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link com.example.myweixin.fragment.BlankFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class BlankFragment extends Fragment {

    private static final String ARG_TEXT = "param1";

    private String mTextString;

    private View rootView;

    public BlankFragment() {
        // Required empty public constructor
    }


    public static com.example.myweixin.fragment.BlankFragment newInstance(String param1) {
        com.example.myweixin.fragment.BlankFragment fragment = new com.example.myweixin.fragment.BlankFragment();
        Bundle args = new Bundle();
        args.putString(ARG_TEXT, param1);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mTextString = getArguments().getString(ARG_TEXT);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        if (rootView == null) {
            rootView = inflater.inflate(R.layout.fragment_blank,container,false);
        }
        initView();
        return rootView;
    }

    private void initView() {
        TextView textVi = rootView.findViewById(R.id.test);
        textVi.setText(mTextString);
    }
}