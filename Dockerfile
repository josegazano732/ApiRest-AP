FROM amazoncorretto :11-alpine-jdk
MAINTAINER JLG
COPY target/SpringBoot-0.0.1-SNAPSHOT.jar  jlg-app.jar
ENTRYPOINT ["java","-jar","/jlg-app.jar"]
