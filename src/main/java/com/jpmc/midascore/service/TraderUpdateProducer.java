package com.jpmc.midascore.service;

import com.jpmc.midascore.config.KafkaConfig;
import org.springframework.stereotype.Service;

@Service
public class TraderUpdateProducer {

    private final KafkaConfig kafkaConfig;

    public TraderUpdateProducer(KafkaConfig kafkaConfig) {
        this.kafkaConfig = kafkaConfig;
    }

    public void sendUpdate(String message) {
        String topic = kafkaConfig.getKafkaTopic();
        System.out.println("Sending to topic: " + topic + " -> " + message);
    }
}
