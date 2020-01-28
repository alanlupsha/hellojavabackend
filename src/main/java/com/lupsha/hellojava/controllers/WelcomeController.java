package com.lupsha.hellojava.controllers;

import com.lupsha.hellojava.services.PhotoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @Autowired
    private PhotoService photoService;

    @RequestMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
    public String getDefaultWelcome() {

        // pick a random id between 1 and 5000
        int photoId = (int)(Math.random() * 5000) + 1;

        return photoService.getPhotoJson(photoId);
    }

    @RequestMapping(path = "/{photoId}", produces = MediaType.APPLICATION_JSON_VALUE)
    public String getPhotoJsonById(@PathVariable("photoId") Integer photoId) {

        return photoService.getPhotoJson(photoId);
    }
}
