# Use an official JDK 21 runtime as a parent image
FROM openjdk:21-jdk-slim

# Set the working directory
WORKDIR /app

# Copy the Maven build output from the target directory to /app
COPY target/demo-spring*.jar /app/demo-spring*.jar

# Expose the port the application runs on
EXPOSE 8080

# Run the application
ENTRYPOINT ["java", "-jar", "/app/demo-spring*.jar"]