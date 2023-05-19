package com.example.mideloTu.models;

import java.util.Date;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table (name = "measurements")
public class MeasurementModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    float temperature;
    float humidity;
    float soilHumidity;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    Date createdAt;
    @ManyToOne
    @JoinColumn(name = "plant_id")
    SensorModel plant;

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public float getTemperature() {
        return temperature;
    }
    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }
    public float getHumidity() {
        return humidity;
    }
    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }
    public float getSoilHumidity() {
        return soilHumidity;
    }
    public void setSoilHumidity(float soilHumidity) {
        this.soilHumidity = soilHumidity;
    }
}
