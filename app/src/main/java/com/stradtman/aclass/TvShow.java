package com.stradtman.aclass;

import java.util.ArrayList;

public class TvShow {
    public static final String DEFAULT_TITLE = "Your Title Here";
    public static final String DEFAULT_STATUS = "Ended";
    public static final String DEFAULT_NETWORK = "Local";
    public static final String DEFAULT_RATING = "NR";
    public static final String DEFAULT_AIR_DATE = "1-1-1970";
    private String title, status, network, rating, airDate;
    private int imageId;
    public ArrayList<Season> seasons;

    public TvShow(String title, String status, String network, String rating, String airDate, int imageId) {
        this.title = title;
        this.status = status;
        this.network = network;
        this.rating = rating;
        this.airDate = airDate;
        this.imageId = imageId;
        this.seasons = new ArrayList<>();
    }
    public TvShow(String title, String status, String network, String rating, String airDate, int imageId, String[] episodeNames, int seasonNumber) {
        this.title = title;
        this.status = status;
        this.network = network;
        this.rating = rating;
        this.airDate = airDate;
        this.imageId = imageId;
        this.seasons = new ArrayList<>();
        this.seasons.add(new Season(seasonNumber, episodeNames));
    }
    public TvShow(String stranger_things, String continuing, String netflix, String rating, String airDate, int poster, int i, String[] episodeNames) {
        this.title = DEFAULT_TITLE;
        this.status = DEFAULT_STATUS;
        this.network = DEFAULT_NETWORK;
        this.rating = DEFAULT_RATING;
        this.airDate = DEFAULT_AIR_DATE;
        this.imageId = 0;
        this.seasons = new ArrayList<>();
    }

}
