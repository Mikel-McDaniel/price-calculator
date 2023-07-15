package com.mikel.price.calculator.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.reactive.function.client.WebClient;

public class PriceChartingClient {

    private static final String URL = "";

    @Autowired
    private WebClient client;

    public PriceChartingClient() {
        WebClient.Builder builder = WebClient.builder();
        client = builder.baseUrl(URL).defaultHeader("", "").build();
    }

}
