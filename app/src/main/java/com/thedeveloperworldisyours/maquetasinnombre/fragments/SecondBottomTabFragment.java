package com.thedeveloperworldisyours.maquetasinnombre.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.thedeveloperworldisyours.maquetasinnombre.R;

public class SecondBottomTabFragment extends Fragment {

    public SecondBottomTabFragment() {
        // Required empty public constructor
    }

    public static SecondBottomTabFragment newInstance() {
        return new SecondBottomTabFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second_bottom_tab, container, false);
    }

}
