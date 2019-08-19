package com.stradtman.aclass;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String[] episodeNames = {
                "Chapter One: The Vanishing of Will Byers",
                "Chapter Two: The Weirdo on Maple Street",
                "Chapter Three: Holly, Jolly",
                "Chapter Four: The Body",
                "Chapter Five: The Flea and the Acrobat",
                "Chapter Six: The Monster",
                "Chapter Seven: The Bathtub",
                "Chapter Eight: The Upside Down"
        };
        TvShow tvShow = new TvShow("Stranger Things", "Continuing", "Netflix", "TV-14", "07-15-2016", R.drawable.poster, 1, episodeNames);
        ArrayList<TvShow>
        ((TextView)findViewById(R.id.text_title)).setText(tvShow.getTitle());
        ((ImageView)findViewById(R.id.image_show)).setImageResource(tvShow.getImageId());
    }
}
