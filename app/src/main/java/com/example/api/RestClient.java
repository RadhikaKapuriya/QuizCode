package com.example.api;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RestClient {

    //https://cn-news-info-api.herokuapp.com/comments/65c343f4e7eb431f8208fcabc831e47c
    //https://newsapi.org/v2/everything?q=Apple&from=2021-02-22&sortBy=headlines_news&apiKey=65c343f4e7eb431f8208fcabc831e47c
    //https://newsapi.org/v2/top-headlines?sources=bbc-news&apiKey=65c343f4e7eb431f8208fcabc831e47c
    public static final String BASE_URL = "https://assessed-da.s3-ap-southeast-1.amazonaws.com/exam/";
    public static final String APIKEY = "65c343f4e7eb431f8208fcabc831e47c";
    private static Retrofit retrofit = null;

   public static Retrofit getClient() {

        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        OkHttpClient client = new OkHttpClient.Builder().addInterceptor(interceptor).build();


        retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .client(client)
                .build();



        return retrofit;
    }
}
