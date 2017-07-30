package org.leon.serg.popularmovies.utils;


import android.support.annotation.NonNull;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import org.leon.serg.popularmovies.BuildConfig;//create in gradle from string buildConfigFailed
import org.leon.serg.popularmovies.MoviesApp;
import org.leon.serg.popularmovies.model.content.Movie;

public class Images {

    public static final String WIDTH_185 = "w185";
    public static final String WIDTH_780 = "w780";

    private Images() {
    }

    public static void loadMovie(@NonNull ImageView imageView, @NonNull Movie movie,
                                 @NonNull String size) {
        loadMovie(imageView, movie.getPosterPath(), size);
    }

    public static void loadMovie(@NonNull ImageView imageView, @NonNull String posterPath,
                                 @NonNull String size) {
        String url = BuildConfig.IMAGES_BASE_URL + size + posterPath;
        Picasso.with(imageView.getContext())
                .load(url)
                .noFade()
                .into(imageView);
    }

    public static void fetch(@NonNull String posterPath, @NonNull String size) {
        String url = BuildConfig.IMAGES_BASE_URL + size + posterPath;
        Picasso.with(MoviesApp.getAppContext())
                .load(url)
                .fetch();
    }
}
