package com.example.mideloTu.Repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.mideloTu.models.MeasurementModel;
@Repository
public interface MeasurementRepository extends CrudRepository<MeasurementModel, Long> {
    
}
