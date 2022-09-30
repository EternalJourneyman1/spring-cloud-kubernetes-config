FROM openjdk:17.0.1-jdk-slim
MAINTAINER Demetrious Robinson
EXPOSE 9000
RUN apt-get update
RUN apt-get -y install curl
WORKDIR /app
COPY /build/libs/client-0.0.1-SNAPSHOT.jar /app/config-client-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "config-client-0.0.1-SNAPSHOT.jar"]