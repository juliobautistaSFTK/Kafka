# Usa una imagen con Java 8
FROM openjdk:8-jdk-alpine

# Directorio de trabajo dentro del contenedor
WORKDIR /app

# Copiamos el jar ya compilado al contenedor
COPY target/kafka-microservicio-1.0.0.jar app.jar

# Puerto que expone tu aplicación (ajustar si usás otro)
EXPOSE 8080

# Comando para ejecutar el JAR
ENTRYPOINT ["java", "-jar", "app.jar"]

