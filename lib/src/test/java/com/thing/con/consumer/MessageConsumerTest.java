package com.thing.con.consumer;


import com.thing.con.config.ServiceConfig;
import com.thing.con.rest.dto.Quote;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertNotNull;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ServiceConfig.class)
public class MessageConsumerTest {


    @Autowired
    private MessageConsumer messageConsumer;

    @Test
    public void testConsume() {
        Quote quote = messageConsumer.getQuote();
        assertNotNull(quote);

        System.out.println(quote);
    }
}
