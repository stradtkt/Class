package com.stradtman.aclass;

import java.util.ArrayList;

public class Season {
    private ArrayList<String> episodeNames;
    private int seasonNumber;

    public Season(int seasonNumber) {
        this.seasonNumber = seasonNumber;
    }
    public Season(int seasonNumber, String[] episodeNames) {

    }

    public String getLastEpisode() {
        return episodeNames.get(episodeNames.size() - 1);
    }
}
