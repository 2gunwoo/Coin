package com.example.myapplication.ui.nft;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class NftViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public NftViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is nft fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}