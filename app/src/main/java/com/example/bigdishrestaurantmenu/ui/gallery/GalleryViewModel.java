package com.example.bigdishrestaurantmenu.ui.gallery;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class GalleryViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public GalleryViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue(
                "This app is developed by: \n" +
                "Name: Lubna Jahan Doly\n" +
                "ID: 171-15-1179\n" +
                "Section: PC-E\n" +
                "Department of CSE\n" +
                "Daffodil International University\n" +
                "BigDish Restaurant Menu is Food & Drink type android app.");
    }

    public LiveData<String> getText() {
        return mText;
    }
}