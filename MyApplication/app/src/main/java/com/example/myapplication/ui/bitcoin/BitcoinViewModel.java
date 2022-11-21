package com.example.myapplication.ui.bitcoin;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class BitcoinViewModel extends ViewModel {


    private MutableLiveData<String> mText;

    public BitcoinViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is gallery fragment");
    }


    public LiveData<String> getText() {
        return mText;
    }
}
