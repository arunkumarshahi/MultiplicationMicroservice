cd api-gateway
sudo ./mvnw spring-boot:run
cd ../gamification
sudo ./mvnw spring-boot:run
cd ../social-multiplication
sudo ./mvnw spring-boot:run
cd ../ui
sudo java -jar /opt/jetty9/start.jar
cd ../service-registry
sudo ./mvnw spring-boot:run