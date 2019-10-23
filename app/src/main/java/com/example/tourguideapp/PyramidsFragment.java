package com.example.tourguideapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;

public class PyramidsFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View pyramidsview = inflater.inflate(R.layout.activity_main, container, false);

        ScrollView layout = pyramidsview.findViewById(R.id.layout);

        layout.setBackgroundResource(R.drawable.pyramids);

        TextView pyramidsTextView = pyramidsview.findViewById(R.id.location_text);

        LocationData data = new LocationData(1);
        pyramidsTextView.setText(data.getText());
        pyramidsTextView.setTextSize(data.getTextSize());

        return pyramidsview  ;
    }
}
