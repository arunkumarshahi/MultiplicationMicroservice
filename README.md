##AssertJ and Mockito will serve us to build useful tests efficiently.

## management plugin is included in the RabbitMQ distribution

rabbitmq-plugins enable rabbitmq_management

## default host and port for rabbitmq
http://localhost:15672/


(Body:'{"multiplicationResultAttemptId":9,"userId":2,"correct":true}' MessageProperties [headers={__TypeId__=microservices.book.multiplication.event.MultiplicationSolvedEvent}, contentType=application/json, contentEncoding=UTF-8, contentLength=0, receivedDeliveryMode=PERSISTENT, priority=0, redelivered=false, receivedExchange=multiplication_exchange, receivedRoutingKey=multiplication.solved, deliveryTag=1, consumerTag=amq.ctag-wcYaWAczAsAA_ia9Tu3bkw, consumerQueue=gamification_multiplication_queue])


step to install jetty : https://www.linuxcloudvps.com/blog/how-to-install-jetty-9-on-ubuntu-16-04/

start jetty :: java -jar /opt/jetty9/start.jar

http://localhost:8000/api/multiplications/1
http://localhost:8761/


http://localhost:8000/api/leaders

http://localhost:8000/api/multiplications/random

to start the consul ::: 
sudo docker run -d --name consul -p 8500:8500 consul

to stat the consul on window :

cd C:\software\consul_1.0.0_windows_amd64
consul agent -dev

update following keyvalue pair in consul
======= config/gateway-service/data =========

spring:
  cloud:
    gateway:
      discovery:
        locator:
          enabled: true
      routes:
        - id: multiplication
          uri: lb://multiplication
          predicates:
            - Path=/multiplications/**
#          filters:
#            - RewritePath=/multiplications/(?<path>.*), /$\{path}
        - id: callme-service
          uri: lb://callme-service
          predicates:
            - Path=/callme/**
          filters:
            - RewritePath=/callme/(?<path>.*), /$\{path}

