#include <WiFi.h>

const char* ssid = "Cebem_21";      
const char* password = "Cebem2010";  

void setup() {
  Serial.begin(115200);
  delay(2000);
  
  WiFi.begin(ssid, password);  

  while (WiFi.status() != WL_CONNECTED) {  
    delay(1000);
    Serial.println("Conectando a la red Wi-Fi...");
  }
  
  Serial.println("Conexión establecida");
  Serial.print("Dirección IP asignada: ");
  Serial.println(WiFi.localIP()); 
}

void loop() {
  
}