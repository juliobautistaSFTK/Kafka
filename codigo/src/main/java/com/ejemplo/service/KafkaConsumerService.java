package com.ejemplo.service;

import com.ejemplo.model.Mensaje;
import com.ejemplo.repository.MensajeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerService {

    @Autowired
    private MensajeRepository mensajeRepository;

    @KafkaListener(topics = "test-topic", groupId = "grupo1")
    public void listen(String message) {
        System.out.println("📥 Mensaje recibido: " + message);

        // Guardar en MongoDB
        Mensaje nuevo = new Mensaje(message);
        mensajeRepository.save(nuevo);

        System.out.println("💾 Mensaje guardado en MongoDB");
    }
}

