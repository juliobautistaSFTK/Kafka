package com.ejemplo.controller;

import com.ejemplo.service.KafkaProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/kafka")
public class KafkaController {

    @Autowired
    private KafkaProducerService producerService;

    // Permitir tanto GET como POST
    @RequestMapping(value = "/send", method = {RequestMethod.GET, RequestMethod.POST})
    public String sendMessage(@RequestParam String message) {
        producerService.sendMessage(message);
        return "Mensaje enviado: " + message;
    }
}

