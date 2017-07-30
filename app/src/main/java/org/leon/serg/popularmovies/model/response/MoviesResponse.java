package org.leon.serg.popularmovies.model.response;

import android.support.annotation.NonNull;

import com.google.gson.annotations.SerializedName;

import org.leon.serg.popularmovies.model.content.Movie;

import java.util.ArrayList;
import java.util.List;

public class MoviesResponse {

    @SerializedName("results")
    private List<Movie> mMovies;

    @NonNull
    public List<Movie> getMovies() {
        if (mMovies == null) {
            return new ArrayList<>();
        }
        return mMovies;
    }

}
