package com.thing.conn.consumer;


import com.thing.conn.rest.dto.Quote;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class MessageConsumer {

    public Quote getQuote() {
        RestTemplate restTemplate = new RestTemplate();
        String url = "https://quoters.apps.pcfone.io/api/random";

        return restTemplate.getForObject(url, Quote.class);

    }

}
