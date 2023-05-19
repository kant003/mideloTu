#include <DHT.h>

int sensor = 2;

DHT dht(sensor, DHT11);
void setup(){
  Serial.begin(9600);
  dht.begin();
}

void loop(){
  delay(5000);

  float humedad = dht.readHumidity();
  float temperatura = dht.readTemperature();

  if(isnan(humedad) ||isnan(temperatura)){
    Serial.println("Error obteniendo los datos del sensor");
  }

  Serial.print("Humedad ");
  Serial.print(humedad);
  Serial.println("%");

  Serial.print("Temperatura ");
  Serial.print(temperatura);
  Serial.println("ºC");
  Serial.println();
}