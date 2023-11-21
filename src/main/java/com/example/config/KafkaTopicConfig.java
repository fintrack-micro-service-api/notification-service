package com.example.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {

    @Bean
    public NewTopic topicTelegram() {
        return TopicBuilder.name("telegram").build();
    }

    @Bean
    public NewTopic topicEmail() {
        return TopicBuilder.name("email").build();
    }

    @Bean
    public NewTopic topicWeb() {
        return TopicBuilder.name("web").build();
    }

}
