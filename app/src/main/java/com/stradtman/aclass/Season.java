package com.stradtman.aclass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Season {
    private int seasonNumber;
    private ArrayList<String> episodeNames;

    public Season(int seasonNumber) {
        this.seasonNumber = seasonNumber;
    }
    public Season(int seasonNumber, String[] episodeNames) {
        this.seasonNumber = seasonNumber;
        this.episodeNames = new ArrayList<>(episodeNames.length);
        this.episodeNames.addAll(Arrays.asList(episodeNames));
    }
    public Season(int seasonNumber, ArrayList<String> episodeNames) {
        this.seasonNumber = seasonNumber;
        this.episodeNames = episodeNames;
    }

    public String getLastEpisode() {
        return episodeNames.get(episodeNames.size() - 1);
    }
}
