package com.app.mvvmarchitecturesample.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.app.mvvmarchitecturesample.R;
import com.app.mvvmarchitecturesample.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    MathViewModel mathViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

       ActivityMainBinding binding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        // Get the ViewModel.
        mathViewModel = new ViewModelProvider(this).get(MathViewModel.class);
        //updates the UI.
       binding.setViewModel(mathViewModel);
       binding.setLifecycleOwner(this);





    }
}