# # Use OpenJDK 17 as the base image
# FROM openjdk:17-jdk-slim
#
# # Set working directory
# WORKDIR /app
#
# # Copy the JAR file from target directory
# COPY target/*.jar app.jar
#
# # Expose the port your Spring Boot app runs on
# EXPOSE 8080
#
# # Run the application
# ENTRYPOINT ["java", "-jar", "app.jar"]



# Stage 1: Build the app using Maven
FROM maven:3.9.4-eclipse-temurin-17 AS build
WORKDIR /app
COPY . .
RUN mvn clean package -DskipTests

# Stage 2: Run the app using a lightweight JDK image
FROM eclipse-temurin:17-jdk
WORKDIR /app
COPY --from=build /app/target/*.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]

