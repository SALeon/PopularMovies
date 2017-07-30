package org.leon.serg.popularmovies.screen.movies;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import org.leon.serg.popularmovies.R;
import org.leon.serg.popularmovies.model.content.Movie;
import org.leon.serg.popularmovies.utils.Images;

import butterknife.BindView;
import butterknife.ButterKnife;


class MovieHolder extends RecyclerView.ViewHolder {

    @BindView(R.id.image)
    ImageView mImageView;


    @NonNull
    public static MovieHolder create(@NonNull Context context, int imageHeight, int imageWidth) {
        View view = View.inflate(context, R.layout.image_item, null);
        ImageView imageView = (ImageView) view.findViewById(R.id.image);
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        layoutParams.height = imageHeight;
        layoutParams.width = imageWidth;
        imageView.requestLayout();
        return new MovieHolder(view);
    }

    private MovieHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this, itemView);
    }

    public void bind(@NonNull Movie movie) {
        Images.loadMovie(mImageView, movie, Images.WIDTH_185);
    }
}
