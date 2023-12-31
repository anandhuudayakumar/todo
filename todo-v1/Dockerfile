# Use the official OpenJDK base image for Java 17
FROM adoptopenjdk:17-jre-hotspot

# Set the working directory inside the container
WORKDIR /app

# Copy the JAR file into the container
COPY build/libs/todo-v1-0.0.1-SNAPSHOT.jar /app/app.jar

# Expose the port that your Spring Boot application will run on
EXPOSE 8080

# Command to run the application
CMD ["java", "-jar", "app.jar"]
