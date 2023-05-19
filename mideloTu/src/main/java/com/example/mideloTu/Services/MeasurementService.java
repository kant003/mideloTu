package com.example.mideloTu.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mideloTu.Repositories.MeasurementRepository;
import com.example.mideloTu.models.MeasurementModel;
@Service
public class MeasurementService {
    @Autowired
    MeasurementRepository measurementRepository;

    public MeasurementModel createMeasurement(MeasurementModel model){
        return measurementRepository.save(model);
    }
}
