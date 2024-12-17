# Use an official OpenJDK runtime as a parent image
FROM openjdk:17-jdk-alpine

# Set the working directory in the container
WORKDIR /app

# Copy the packaged jar file into the container
COPY target/pokedata-0.0.1-SNAPSHOT.jar app.jar

# Expose the port the application runs on
EXPOSE 9191

# Run the jar file
ENTRYPOINT ["java", "-jar", "app.jar"]