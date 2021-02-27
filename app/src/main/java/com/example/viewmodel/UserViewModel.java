package com.example.viewmodel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.example.Model.Quiz;
import com.example.repository.UserRepository;

import java.util.List;



public class UserViewModel extends AndroidViewModel {
    UserRepository repository;

    public UserViewModel(@NonNull Application application) {
        super(application);
        repository = new UserRepository(application);
    }

    public LiveData<List<Quiz>> getAllUsers() {
        return repository.getUsers();
    }


}
