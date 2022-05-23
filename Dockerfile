FROM openjdk:11
EXPOSE 8080
ADD target/*.jar app.jar
ENTRYPOINT ["java" , "-jar", "/app.jar"]
#ADD target/spring-boot-docker.jar spring-boot-docker.jar
