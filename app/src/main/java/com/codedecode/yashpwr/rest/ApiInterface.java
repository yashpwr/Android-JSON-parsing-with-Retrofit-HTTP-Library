package com.codedecode.yashpwr.rest;

import com.codedecode.yashpwr.model.MoviesResponse;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {
    @GET("/retrofit/movie.json")
    Call<MoviesResponse> getTopRatedMovies();
}
