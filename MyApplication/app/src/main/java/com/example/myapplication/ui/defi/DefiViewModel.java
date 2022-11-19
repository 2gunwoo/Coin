package com.example.myapplication.ui.defi;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class DefiViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public DefiViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is DEFI fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}