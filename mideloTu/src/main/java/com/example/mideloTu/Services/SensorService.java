package com.example.mideloTu.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mideloTu.Repositories.SensorRepository;
import com.example.mideloTu.models.SensorModel;

@Service
public class SensorService {

    @Autowired
    SensorRepository plantRepositorie;

    public boolean existsId(long id) {
        return plantRepositorie.existsById(id);
    }
    public SensorModel createMeasurement(SensorModel model){
        return plantRepositorie.save(model);
    }
}
