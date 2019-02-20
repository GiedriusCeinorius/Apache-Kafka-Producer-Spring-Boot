package com.gce.kafka.kafkaexampleproducer.resource;

import com.gce.kafka.kafkaexampleproducer.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("kafka")
public class UserResource {


    @Autowired
    @Qualifier("kafkaTemplate")
    private KafkaTemplate<String, User> kafkaTemplate;
    private static final String TOPIC = "Kafka_Example_json";

    @GetMapping("/publish/{name}/{dept}/{salary}")
    public String post(@PathVariable("name") String name, @PathVariable("dept") String dept, @PathVariable("salary") Long salary) {

        kafkaTemplate.send(TOPIC, new User(name, dept, salary));
        return "Published successfully!";
    }
}
