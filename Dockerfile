FROM openjdk:17-jdk-slim

# Definir el directorio de trabajo
WORKDIR /app

# Copiar el archivo JAR generado en el directorio de trabajo
COPY target/workshop-0.0.1-SNAPSHOT.jar workshop-kafka.jar

# Exponer el puerto configurado (8081)
EXPOSE 8081

# Comando para ejecutar el servicio de Spring Boot
CMD ["java", "-jar", "workshop-kafka.jar"]
