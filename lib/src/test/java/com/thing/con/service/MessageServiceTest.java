package com.thing.con.service;

import com.thing.con.config.ServiceConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ServiceConfig.class)
public class MessageServiceTest {


    @Autowired
    private MessageService messageService;

    @Test
    public void testMessage() {
        messageService.showMessage();
    }

}