package com.example.myapplication.ui.sport;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SportViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public SportViewModel() {
        mText = new MutableLiveData<>();
        //mText.setValue("Супер крутые инструктора!");
    }

    public LiveData<String> getText() {
        return mText;
    }
}