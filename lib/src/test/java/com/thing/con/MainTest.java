package com.thing.con;

import com.thing.con.config.ServiceConfig;
import com.thing.con.service.MessageService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainTest {

    public static void main(String... args) {


        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ServiceConfig.class);

        MessageService messageService = applicationContext.getBean(MessageService.class);
        messageService.showMessage();

    }
}
