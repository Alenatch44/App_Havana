package com.example.myapplication.ui.info_ins;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class OlgabViewFragment extends ViewModel {
    private final MutableLiveData<String> mText;

    public OlgabViewFragment() {
        mText = new MutableLiveData<>();
    }

    public LiveData<String> getText() {
        return mText;
    }
}