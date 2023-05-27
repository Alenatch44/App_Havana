package com.example.myapplication.ui.instructor;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class InstructorViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public InstructorViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Супер крутые инструктора!");
    }

    public LiveData<String> getText() {
        return mText;
    }
}