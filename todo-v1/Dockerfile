# Use the official OpenJDK base image for Java 17
FROM openjdk:17-jre as builder

# Set the working directory inside the container
WORKDIR /app

# Copy only the Gradle files first to take advantage of caching
COPY build.gradle settings.gradle ./
COPY gradle ./gradle

# Download the dependencies
RUN ./gradlew --version
RUN ./gradlew clean build --no-daemon

# Now, copy the application code
COPY . .

# Build the application
RUN ./gradlew bootJar

# Create a new image using a smaller base image
FROM openjdk:17-jre-hotspot

# Set the working directory inside the container
WORKDIR /app

# Copy the JAR file from the builder stage
COPY --from=builder /app/build/libs/todo-v1-0.0.1-SNAPSHOT.jar /app/app.jar

# Expose the port that your Spring Boot application will run on
EXPOSE 8080

# Command to run the application
CMD ["java", "-jar", "app.jar"]
