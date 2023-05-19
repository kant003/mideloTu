package com.example.mideloTu.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.mideloTu.Services.SensorService;
import com.example.mideloTu.models.SensorModel;

@RestController
public class SensorController {
    
    @Autowired
    SensorService plantService;

    @GetMapping("/insert/sensor")
    public String insertMeasurement(@RequestParam("mac") String mac, @RequestParam("city") String city,@RequestParam("latitud") String latitud,@RequestParam("longitud") String longitud){

        SensorModel model = new SensorModel();
        model.setMac(mac);
        model.setCity(city);
        model.setLatitud(Long.parseLong(latitud));
        model.setLongitud(Long.parseLong(longitud));

        return "Plant creado con éxito";
    }
}
