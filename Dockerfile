FROM amazoncorretto:11-alpine-jdk
MAINTAINER JLG
COPY target/*.jar /app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
