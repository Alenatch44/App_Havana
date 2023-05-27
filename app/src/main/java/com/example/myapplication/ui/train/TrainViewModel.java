package com.example.myapplication.ui.train;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class TrainViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public TrainViewModel() {
        mText = new MutableLiveData<>();
        //mText.setValue("Супер крутые инструктора!");
    }

    public LiveData<String> getText() {
        return mText;
    }
}