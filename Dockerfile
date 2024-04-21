FROM openjdk:17-jdk-alpine
EXPOSE 80
ARG JAR_FILE=build/libs/*.jar
ADD ${JAR_FILE} friendship-service.jar
ENTRYPOINT ["java","-jar","/friendship-service.jar"]
