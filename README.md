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
