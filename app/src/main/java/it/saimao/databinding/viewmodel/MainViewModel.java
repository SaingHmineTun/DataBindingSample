package it.saimao.databinding.viewmodel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MainViewModel extends ViewModel {
    public MutableLiveData<String> message = new MutableLiveData<>();

    public void setMessage(String message) {
        this.message.setValue(message);
    }
}
