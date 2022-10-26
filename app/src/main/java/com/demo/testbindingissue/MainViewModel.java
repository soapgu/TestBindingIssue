package com.demo.testbindingissue;

import android.app.Application;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;

public class MainViewModel extends AndroidViewModel {

    public MainViewModel(@NonNull Application application) {
        super(application);
    }

    public void mainEcho(){
        Toast toast = Toast.makeText(this.getApplication(), "Hello Main Activity", Toast.LENGTH_SHORT);
        toast.show();
    }
}
