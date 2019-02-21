# Apache-Kafka-Producer-Spring-Boot

This application together with https://github.com/GiedriusCeinorius/Apache-Kafka-Consumer-Spring-Boot covers Spring-Boot with Apache Kafka producer and consumer examples.

## Getting Started

Download Apache Kafka from official site.

### Prerequisites

1. On Windows open cmd and run Zookeeper:

zookeeper-server-start.bat ../../config/zookeeper.properties

2. Open another cmd and run Kafka server:

kafka-server-start.bat ../../config/server.properties

3. Open another cmd and create topic:

kafka-topics.bat --create --zookeeper localhost:2181 --replication-factor 1 --partitions 1 --topic Kafka_Example_json

4. Open another cmd and run Spring-Boot producer application:

mvnw spring-boot:run

5. Open another cmd and run Spring-Boot consumer application:

mvnw spring-boot:run

## Running the tests

O web browser and type:
 
http://localhost:8081/kafka/publish/Ted/tech/1800

go back to Spring-Boot consumer application cmd window and watch how json message has been subcscribed.



