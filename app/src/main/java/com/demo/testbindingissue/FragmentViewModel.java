package com.demo.testbindingissue;

import android.app.Application;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;

public class FragmentViewModel extends AndroidViewModel {
    public FragmentViewModel(@NonNull Application application) {
        super(application);
    }

    public void echo(){
        Toast toast = Toast.makeText(this.getApplication(), "Hello Fragment!!!!", Toast.LENGTH_SHORT);
        toast.show();
    }
}
