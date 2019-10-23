package com.example.tourguideapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class NileFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        View nileview = inflater.inflate(R.layout.activity_main, container, false);

        ScrollView layout = nileview.findViewById(R.id.layout);

        layout.setBackgroundResource(R.drawable.nile);

        TextView textView = nileview.findViewById(R.id.location_text);

        LocationData data = new LocationData(4);
        textView.setText(data.getText());
        textView.setTextSize(data.getTextSize());

        return nileview  ;

    }
}
