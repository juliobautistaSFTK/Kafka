#### Codespaces

GitHub Codespaces es un entorno de desarrollo integrado (IDE) basado en la web, completamente configurado y alojado en la nube, que permite a los desarrolladores escribir, compilar, probar y depurar código directamente desde GitHub. Codespaces proporciona una máquina virtual (VM) con todas las herramientas necesarias para trabajar en un proyecto, de modo que puedes desarrollar sin necesidad de configurar manualmente un entorno local.

Este ejercicio está configurado para crear un Codespace y se ejecuten las instrucciones necesarias para ambientar una maquina virtual y puedas hacer el ejercicio, es importante no alterar el Codespace.

Para acceder a los codespaces da click en <>Code, en la parte de la izquierda de tu pantalla, despues da click en <>Code que está en verde, veráz un boton que dice CrearCodespace on main.

![Descripción de la imagen](Imagenes/codespacekafka.png) 

# **Instrucciones**

Este código se ejecuta en lo que llamamos Codespaces.

Contiene lo necesario para levantar los contenedores necesarios para ver la funcionalidad de kafka.

kafka-app

kafka

zookeeper

postgres

mongo


# **Crear las contenedores**

Abre tu Codespeaces 

una vez que te presente la terminal, cambiate al directorio codigo.

![Descripción de la imagen](Imagenes/cdcodigo.png) 

compila el código que viene en este ejercicio

primero

  mvn clean install

despues

  mvn clean package

Ejecuta el docker-compose para levantar los contenedores y todos los demas servicios

  docker compose up -d

Una vez que termine valida tecleando docker ps 

![Descripción de la imagen](Imagenes/dockerpskafka.png) 


