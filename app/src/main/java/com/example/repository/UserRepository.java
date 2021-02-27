package com.example.repository;

import android.app.Application;
import android.util.Log;

import androidx.lifecycle.MutableLiveData;

import com.example.Model.Quiz;
import com.example.api.GithubService;
import com.example.api.RestClient;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class UserRepository {

    private ArrayList<Quiz> userArrayList = new ArrayList<>();
    public MutableLiveData<List<Quiz>> mutableLiveData = new MutableLiveData<>();
    GithubService apiInterface;
    private Application application;
    public UserRepository(Application application) {
        this.application = application;
    }




    public MutableLiveData<List<Quiz>> getUsers() {
        //https://newsapi.org/v2/everything?q=Apple&from=2021-02-22&sortBy=headlines_news&apiKey=65c343f4e7eb431f8208fcabc831e47c
        //https://newsapi.org/v2/everything?&from=2021-02-22&sortBy=headlines_news&q=Apple&apiKey=65c343f4e7eb431f8208fcabc831e47c
        apiInterface = RestClient.getClient().create(GithubService.class);

//        Call<Response<String>> call = apiInterface.getUsers(params);
//        call.enqueue(new Callback<Response<String> >() {
//            @Override
//            public void onResponse(Call<Response<String>> call, Response<Response<String> > response) {
//                Log.d("TTT123","call = " + response);
//            }
//
//            @Override
//            public void onFailure(Call<Response<String> > call, Throwable t) {
//                Log.d("TTT123","onFailure = " + t.getMessage());
//            }
//        });

//        Call<Quiz> call = apiInterface.getUsers();
//        call.enqueue(new Callback<Quiz>() {
//            @Override
//            public void onResponse(Call<Quiz> call, Response<Quiz> response) {
//                Log.d("TTT123","call = " + response);
//            }
//
//            @Override
//            public void onFailure(Call<Quiz> call, Throwable t) {
//                Log.d("TTT123","onFailure = " + t.getMessage());
//            }
//        });
        Call<List<Quiz>> call = apiInterface.getUsers();
        call.enqueue(new Callback<List<Quiz>>() {
            @Override
            public void onResponse(Call<List<Quiz>> call, Response<List<Quiz>> response) {
                Log.d("TTT123","call = " + response);
                if (response.body() != null) {
                    userArrayList = (ArrayList<Quiz>) response.body();

                    mutableLiveData.setValue(userArrayList);

                }
            }
            @Override
            public void onFailure(Call<List<Quiz>> call, Throwable t) {
                Log.d("TTT123","onFailure = " + t.getCause());
            }
        });
        return mutableLiveData;
    }

}
