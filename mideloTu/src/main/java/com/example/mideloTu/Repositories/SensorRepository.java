package com.example.mideloTu.Repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.mideloTu.models.SensorModel;
@Repository
public interface SensorRepository extends CrudRepository<SensorModel, Long>{
    
}
