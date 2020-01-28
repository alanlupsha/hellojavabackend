package com.lupsha.hellojava.services;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class PhotoService {

    private static final Logger logger = LogManager.getLogger(PhotoService.class);

    private final RestTemplate restTemplate;

    public PhotoService(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplate = restTemplateBuilder.build();
    }

    public String getPhotoJson(final Integer recordId) {

        Integer tempRecordId = recordId;

        if (recordId < 1 || recordId > 5000) {
            tempRecordId = 1;
        }

        String url = "https://jsonplaceholder.typicode.com/photos/" + tempRecordId;

        System.out.println("URL hit: " + url);

        return this.restTemplate.getForObject(url, String.class);
    }
}
