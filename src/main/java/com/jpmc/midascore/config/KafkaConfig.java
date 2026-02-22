package com.jpmc.midascore.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class KafkaConfig {

    @Value("${general.kafka-topic}")
    private String kafkaTopic;

    public String getKafkaTopic() {
        return kafkaTopic;
    }
}
