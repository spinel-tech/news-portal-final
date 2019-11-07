package com.example.newsapp.ui.agriculture;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class AgricultureViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public AgricultureViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is gallery fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}