package com.example.myapplication.ui.us;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class UsViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public UsViewModel() {
        mText = new MutableLiveData<>();
       // mText.setValue("Супер крутые инструктора!");
    }

    public LiveData<String> getText() {
        return mText;
    }
}