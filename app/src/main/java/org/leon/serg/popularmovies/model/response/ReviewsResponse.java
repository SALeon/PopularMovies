package org.leon.serg.popularmovies.model.response;

import android.support.annotation.NonNull;

import com.google.gson.annotations.SerializedName;

import org.leon.serg.popularmovies.model.content.Review;

import java.util.ArrayList;
import java.util.List;

public class ReviewsResponse {

    @SerializedName("results")
    private List<Review> mReviews;

    @NonNull
    public List<Review> getReviews() {
        if (mReviews == null) {
            mReviews = new ArrayList<>();
        }
        return mReviews;
    }
}
