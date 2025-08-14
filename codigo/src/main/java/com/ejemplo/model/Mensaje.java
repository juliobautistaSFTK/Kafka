package com.ejemplo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "mensajes")
public class Mensaje {

    @Id
    private String id;

    private String contenido;

    public Mensaje() {}

    public Mensaje(String contenido) {
        this.contenido = contenido;
    }

    // Getters y setters
    public String getId() {
        return id;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }
}

