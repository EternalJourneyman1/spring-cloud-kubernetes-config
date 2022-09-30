FROM openjdk:17.0.1-jdk-slim
MAINTAINER Demetrious Robinson
EXPOSE 8888
RUN apt-get update
RUN apt-get -y install curl
WORKDIR /app
COPY /build/libs/server-0.0.1-SNAPSHOT.jar /app/config-server-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "config-server-0.0.1-SNAPSHOT.jar"]