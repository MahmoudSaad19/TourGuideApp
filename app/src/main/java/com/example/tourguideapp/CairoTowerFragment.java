package com.example.tourguideapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;

public class CairoTowerFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View towerview = inflater.inflate(R.layout.activity_main, container, false);

        ScrollView layout = towerview.findViewById(R.id.layout);

        layout.setBackgroundResource(R.drawable.cairo_tower);

        TextView textView = towerview.findViewById(R.id.location_text);

        LocationData data = new LocationData(3);
        textView.setText(data.getText());
        textView.setTextSize(data.getTextSize());

        return towerview ;
    }
}
