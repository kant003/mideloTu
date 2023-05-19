# Mostrar la humedad y temperatura del ambiente por pantalla

### MATERIALES   

- ESP32 y protoboard
- Sensor de humedad y temperatura DHT11

### EXPLICACIÓN

Las conexiones realizadas son las siguientes:
- El pin + a la salida de 5V
- El pin - a tierra
- El pin OUT al pin 2 en nuestro caso 


En primer lugar, instanciamos un objeto dht pasando como parámetros el pin OUT y el tipo de sensor (dht11). Mediante las funciones readHumity y readTemperature realizamos las mediciones deseadas. La función isnan hará saltar un mensaje de error siempre que no se reciban los parámetros deseados. Si no hay ningún error, se imprimen la humedad y temperatura por pantalla. 

Para que funcione el código necesitamos instalar las siguientes librerías:

    https://github.com/adafruit/DHT-sensor-library
----
    https://github.com/adafruit/Adafruit_Sensor

### MONTAJE

![imagen del montaje](montaje.jpg)