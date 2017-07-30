package org.leon.serg.popularmovies.model.response;

import android.support.annotation.NonNull;

import com.google.gson.annotations.SerializedName;

import org.leon.serg.popularmovies.model.content.Video;

import java.util.ArrayList;
import java.util.List;

public class VideosResponse {

    @SerializedName("results")
    private List<Video> mVideos;

    @NonNull
    public List<Video> getVideos() {
        if (mVideos == null) {
            return new ArrayList<>();
        }
        return mVideos;
    }
}

