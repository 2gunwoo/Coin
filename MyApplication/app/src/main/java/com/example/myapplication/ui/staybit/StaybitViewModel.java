package com.example.myapplication.ui.staybit;

import android.widget.Button;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class StaybitViewModel extends ViewModel {

    private static MutableLiveData<String> mText;

    public StaybitViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("암호화폐는 우주와 같다.\n무한한 발견속에서 경험하지 않는건 정답이 아니다.\n내 생각을 누가 판단할 수 있는가?\n많은 정보와 미래에서 해답을 얻어야 한다.\n시작하자 내가 정답인 새로운 길 스테이비트");
    }

    public static LiveData<String> getText() {
        return mText;
    }
}