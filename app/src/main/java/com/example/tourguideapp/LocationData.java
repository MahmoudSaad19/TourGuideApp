package com.example.tourguideapp;

class LocationData {

    private int textSize;
    private int text;

    LocationData(int position) {

        if (position == 0){
            this.text= R.string.cairo_text;
            this.textSize = 45 ;
        }else if (position == 1){
            this.text= R.string.pyramids_text;
            this.textSize = 40 ;
        }else if (position == 2){
            this.text= R.string.azher_park_text;
            this.textSize = 35 ;
        }else if (position == 3){
            this.text= R.string.cairo_tower_text;
            this.textSize = 40 ;
        }else if (position == 4){
            this.text= R.string.nile_text;
            this.textSize = 35 ;
        }
    }

    int getTextSize() {
        return textSize;
    }


    int getText() {
        return text;
    }

}
