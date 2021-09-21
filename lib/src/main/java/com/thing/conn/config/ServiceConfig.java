package com.thing.conn.config;


import com.thing.conn.consumer.MessageConsumer;
import com.thing.conn.service.MessageService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceConfig {


    @Bean
    public MessageService messageService() {
        return new MessageService();
    }

    @Bean
    public MessageConsumer messageConsumer() {
        return new MessageConsumer();
    }


}
