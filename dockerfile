
FROM openjdk:8-jdk-alpine

RUN apk update && apk add tzdata
ENV TZ="America/Mexico_City"

ADD ./target/visefront-0.0.3-SNAPSHOT.jar app.jar


ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]