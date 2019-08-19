package com.stradtman.aclass;

import java.util.ArrayList;

public class TvShow {
    private String title, status, network, rating, airDate;
    private int imageId;
    private ArrayList<Season> seasons;

    public TvShow(String title, String status, String network, String rating, String airDate, int imageId) {
        this.title = title;
        this.status = status;
        this.network = network;
        this.rating = rating;
        this.airDate = airDate;
        this.imageId = imageId;
    }


}
