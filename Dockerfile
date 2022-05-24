FROM adoptopenjdk/openjdk11
COPY target/app-backend.jar app-backend.jar
ENTRYPOINT ["java" , "-jar", "/app-backend.jar"]
#ADD target/spring-boot-docker.jar spring-boot-docker.jar
