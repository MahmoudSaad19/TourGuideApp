package com.example.tourguideapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;

public class AzharParkFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        View azherview = inflater.inflate(R.layout.activity_main, container, false);

        ScrollView layout = azherview.findViewById(R.id.layout);

        layout.setBackgroundResource(R.drawable.al_azhar_park);

        TextView textView = azherview.findViewById(R.id.location_text);

        LocationData data = new LocationData(2);
        textView.setText(data.getText());
        textView.setTextSize(data.getTextSize());

        return azherview  ;

    }
}
