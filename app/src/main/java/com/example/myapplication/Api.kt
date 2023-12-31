package com.example.myapplication

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface Api {
    @GET("movie/upcoming")
    suspend fun getUpcomingMovies(
        @Query("api_key") apiKey : String = BuildConfig.TMDB_API_KEY
    ) : Response<GetMoviesResponse>

    @GET("search/movie")
    suspend fun searchMovie(
        @Query("query") query: String,
        @Query("api_key") apiKey: String = BuildConfig.TMDB_API_KEY
    ): Response<GetMoviesResponse>

    @GET("movie/{id}")
    suspend fun getMovie(@Path("id") id:Long,
                         @Query("api_key") apiKey: String = BuildConfig.TMDB_API_KEY
    ): Response<Movie>


}