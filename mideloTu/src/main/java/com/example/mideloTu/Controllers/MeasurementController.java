package com.example.mideloTu.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.mideloTu.Services.MeasurementService;
import com.example.mideloTu.Services.SensorService;
import com.example.mideloTu.models.MeasurementModel;

@RestController
public class MeasurementController {
    @Autowired
    MeasurementService measurementService;
    @Autowired
    SensorService plantService;

    @GetMapping("/insert/measurement")
    public String insertMeasurement(@RequestParam("temperature") float temperature,
            @RequestParam("humidity") float humidity, @RequestParam("soilHumidity") float soilHumidity,
            @RequestParam("sensorId") long sensorId) {

        if (plantService.existsId(sensorId)) {
            MeasurementModel model = new MeasurementModel();
            model.setTemperature(temperature);
            model.setHumidity(humidity);
            model.setSoilHumidity(soilHumidity);
            measurementService.createMeasurement(model);
        }else{
            return "Error en la creacion del measurement";
        }
        return "Measurement creado con éxito";
    }
}
