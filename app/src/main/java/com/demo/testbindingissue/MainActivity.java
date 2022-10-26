package com.demo.testbindingissue;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private MainViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.viewModel =  new ViewModelProvider(this).get(MainViewModel.class);
        ViewDataBinding binding = DataBindingUtil.setContentView( this, R.layout.activity_main  );
        binding.setVariable( BR.dataContext , this.viewModel );
        binding.setLifecycleOwner(this);


        BlankFragment fragment = BlankFragment.newInstance();
        getSupportFragmentManager().beginTransaction()
                .setReorderingAllowed(true)
                .replace(R.id.container, fragment, null)
                .commit();
    }


}