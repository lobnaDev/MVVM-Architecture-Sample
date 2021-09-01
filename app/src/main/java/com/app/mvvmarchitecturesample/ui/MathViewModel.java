package com.app.mvvmarchitecturesample.ui;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.app.mvvmarchitecturesample.NumberModel;

public class MathViewModel extends ViewModel {

    //step 2 - define mutableLivedata
    public MutableLiveData<String> sumMutableLivedata  = new MutableLiveData <>();
    public MutableLiveData<String> MultipleMutableLivedata = new MutableLiveData<>();
    public MutableLiveData<String> DivideMutableLivedata = new MutableLiveData<>();

    //step 1 -get number from database
    private NumberModel getNumbers(){

        return new NumberModel(4, 2);
    }


    //step 3 - call this method when every event happen
    public void SumNumbers( ) {
        int num1 = getNumbers().getFirstNum();
        int num2 = getNumbers().getSecondNum();
        int plus = num1 + num2;
        sumMutableLivedata.setValue(String.valueOf(plus));
    }

    public void MultipleNumber(){
        int num1 = getNumbers().getFirstNum();
        int num2 = getNumbers().getSecondNum();
        int Multiple = num1 * num2;
        MultipleMutableLivedata.setValue(String.valueOf(Multiple));

    }
    public void DivideNumber(){
        int num1 = getNumbers().getFirstNum();
        int num2 = getNumbers().getSecondNum();
        int Divide = num1 / num2;
        DivideMutableLivedata.setValue(String.valueOf(Divide));

    }
}
