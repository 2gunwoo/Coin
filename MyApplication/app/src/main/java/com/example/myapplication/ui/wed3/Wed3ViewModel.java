package com.example.myapplication.ui.wed3;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class Wed3ViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public Wed3ViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is DAPP fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}