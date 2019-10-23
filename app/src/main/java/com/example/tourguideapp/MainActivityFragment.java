package com.example.tourguideapp;

import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import android.widget.TextView;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;

public class MainActivityFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View cairoview = inflater.inflate(R.layout.activity_main, container, false);

        ScrollView layout = cairoview.findViewById(R.id.layout);

        layout.setBackgroundResource(R.drawable.cairo);

        TextView textView = cairoview.findViewById(R.id.location_text);

        LocationData data = new LocationData(0);
        textView.setText(data.getText());
        textView.setTextSize(data.getTextSize());
        textView.setTextColor(Color.argb(200,255,255,255));

        return cairoview ;

    }
}
