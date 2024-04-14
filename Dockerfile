FROM amazoncorretto:17-alpine-jdk

MAINTAINER yavor
ENV LANG en_GB.UTF-8

COPY ./build/libs/airports-1.0.0.jar airports-1.0.0.jar
ENTRYPOINT ["java","-jar","airports-1.0.0.jar","--spring.profiles.active=default","--server.port=80"]
