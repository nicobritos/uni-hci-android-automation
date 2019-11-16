package com.hci.StarkIndustries.data.Models.DeviceModels;

import com.hci.StarkIndustries.data.Models.DeviceType;
import com.hci.StarkIndustries.data.Models.CommonDeviceModel;

public class FridgeModel extends CommonDeviceModel {

    public int temperature;
    public int freezerTemperature;
    public int mode;


    public FridgeModel(String name, String id, String room) {
        super(name, id, room, DeviceType.Fridge,false);
        temperature = 6;
        freezerTemperature = -10;
        mode = 1;
    }
}