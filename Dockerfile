FROM openjdk:17-alpine
WORKDIR /app
COPY build/libs/notification-service-0.0.1-SNAPSHOT.jar notification-service.jar
ENTRYPOINT ["java", "-jar", "notification-service.jar"]