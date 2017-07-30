package org.leon.serg.popularmovies.network;

import org.leon.serg.popularmovies.model.response.MoviesResponse;

import retrofit2.http.GET;
import rx.Observable;

public interface MovieService {

    @GET("popular")
    Observable<MoviesResponse> popularMovies();

}