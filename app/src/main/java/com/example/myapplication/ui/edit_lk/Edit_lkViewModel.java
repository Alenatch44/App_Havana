package com.example.myapplication.ui.edit_lk;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class Edit_lkViewModel extends ViewModel {
    private final MutableLiveData<String> mText;

    public Edit_lkViewModel() {
        mText = new MutableLiveData<>();
        //mText.setValue("This is gallery fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}