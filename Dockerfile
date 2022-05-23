FROM openjdk:11-alpine
#EXPOSE 8080
COPY target/app-backend.jar app-backend.jar
ENTRYPOINT ["java" , "-jar", "/app-backend.jar"]
#ADD target/spring-boot-docker.jar spring-boot-docker.jar
