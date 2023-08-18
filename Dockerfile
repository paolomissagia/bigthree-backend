# Build stage
FROM maven:3.9.0-eclipse-temurin:17-alpine AS build
COPY . .
RUN mvn clean package -DskipTests


# Package stage
FROM openjdk:19
COPY --from=build /target/bigthree-0.0.1-SNAPSHOT.jar bigthree.jar
ENTRYPOINT ["java","-jar","/app.jar"]
EXPOSE 8080