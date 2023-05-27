package com.example.myapplication.ui.info_ins;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class NastyaViewFragment extends ViewModel {
    private final MutableLiveData<String> mText;

    public NastyaViewFragment() {
        mText = new MutableLiveData<>();
        //mText.setValue("This is gallery fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}