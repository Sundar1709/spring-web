FROM openjdk:17-alpine
WORKDIR /app
COPY . .
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "your-app.jar"]