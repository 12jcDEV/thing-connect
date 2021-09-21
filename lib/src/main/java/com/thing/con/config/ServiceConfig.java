package com.thing.con.config;


import com.thing.con.consumer.MessageConsumer;
import com.thing.con.service.MessageService;
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
