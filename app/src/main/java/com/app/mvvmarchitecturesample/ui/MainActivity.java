package com.app.mvvmarchitecturesample.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.app.mvvmarchitecturesample.R;

public class MainActivity extends AppCompatActivity {

    MathViewModel mathViewModel;
    TextView plusTextview;
    TextView multipleTexview;
    TextView divieTextview;
    Button plusButton;
    Button dividButton;
    Button multiplyButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        plusTextview = findViewById(R.id.plus_result_textView);
        multipleTexview = findViewById(R.id.mul_result_textView);
        divieTextview = findViewById(R.id.div_result_textView);

        plusButton = findViewById(R.id.plus_button);
        multiplyButton = findViewById(R.id.mul_button);
        dividButton = findViewById(R.id.div_button);


        // Get the ViewModel.
        mathViewModel = new ViewModelProvider(this).get(MathViewModel.class);
        // Create the observer which updates the UI.
        mathViewModel.sumMutableLivedata.observe(this, new Observer<String>() {
            @Override
            public void onChanged(String s) {
                // Update the UI, in this case, a TextView.
                plusTextview.setText(s);

            }
        });
        mathViewModel.MultipleMutableLivedata.observe(this, new Observer<String>() {
            @Override
            public void onChanged(String s) {
                // Update the UI, in this case, a TextView.
                multipleTexview.setText(s);

            }
        });
        mathViewModel.DivideMutableLivedata.observe(this, new Observer<String>() {
            @Override
            public void onChanged(String s) {
                // Update the UI, in this case, a TextView.
                divieTextview.setText(s);

            }
        });


        plusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mathViewModel.SumNumbers();
            }
        });
        multiplyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mathViewModel.MultipleNumber();
            }
        });
        dividButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mathViewModel.DivideNumber();
            }
        });


    }
}