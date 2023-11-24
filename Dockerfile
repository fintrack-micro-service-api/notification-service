FROM openjdk:17-alpine
WORKDIR /app
COPY build/libs/notification-service-*.jar notification-service.jar
ENTRYPOINT ["java", "-jar", "notification-service.jar"]