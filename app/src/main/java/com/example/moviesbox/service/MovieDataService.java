package com.example.moviesbox.service;

import com.example.moviesbox.model.Result;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface MovieDataService {

    //Base url
    //https://api.themoviedb.org/3/
    //
    //End point url
    //movie/popular?api_key=978000b60bb119dff52a7dd0869ef22a
    @GET("movie/popular")
    Call<Result> getPopularMovies(@Query("api_key") String apiKey);
}
