package com.hci.StarkIndustries.ui.DeviceMenu.Curtains;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.hci.StarkIndustries.data.Models.DeviceModels.CurtainsModel;

public class CurtainsViewModel extends ViewModel {

    private MutableLiveData<CurtainsModel> mCurtains;
    private CurtainsModel model;
    private String id = "";

    public LiveData<CurtainsModel> getModel(String id){

        if(mCurtains == null){
            mCurtains = new MutableLiveData<CurtainsModel>();
            model = new CurtainsModel("Cortinitas",id,"Room1");
            loadModel();
        }

        return mCurtains;
    }

    private void loadModel(){
        // Aca habria que hablar con la API
        mCurtains.setValue(model);
    }

    public void setState(boolean state){
        model.isOpen = state;
        loadModel();
    }


}