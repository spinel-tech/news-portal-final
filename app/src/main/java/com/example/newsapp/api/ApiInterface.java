package com.example.newsapp.api;

import com.example.newsapp.models.Article;
import com.example.newsapp.models.National;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {

    @GET("api/agriculture")
    Call<List<Article>> getArticles();


    @GET("api/national")
    Call<List<National>> getNational();



}
