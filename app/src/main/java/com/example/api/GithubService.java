package com.example.api;


import com.example.Model.Quiz;

import java.util.List;
import java.util.Map;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.QueryMap;


public interface GithubService {

    //https://newsapi.org/v2/top-headlines?sources=bbc-news&apiKey=65c343f4e7eb431f8208fcabc831e47c
    @GET("exam.json")
    Call<List<Quiz>> getUsers();




}
