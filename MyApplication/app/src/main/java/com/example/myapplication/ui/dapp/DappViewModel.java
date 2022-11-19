package com.example.myapplication.ui.dapp;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class DappViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public DappViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is DAPP fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}