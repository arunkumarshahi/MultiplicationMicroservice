cd api-gateway
sudo mvn spring-boot:run
cd ../gamification
sudo mvn spring-boot:run
cd ../social-multiplication
sudo mvn spring-boot:run
cd ../ui
sudo java -jar /opt/jetty9/start.jar
cd ../service-registry
sudo mvn spring-boot:run
