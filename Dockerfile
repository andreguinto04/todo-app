# Use Java 17 base image
FROM openjdk:17-jdk-slim

# Copy the built JAR from the target directory
COPY target/*.jar app.jar

# Expose the port your app uses (optional, e.g., 8080)
EXPOSE 8080

# Run the app
ENTRYPOINT ["java", "-jar", "/app.jar"]