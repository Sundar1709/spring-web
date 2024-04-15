FROM openjdk:8
RUN mkdir /usr/app
COPY application/demo-0.0.1-SNAPSHOT.jar  /usr/app
WORKDIR /usr/app
RUN sh -c 'touch demo-0.0.1-SNAPSHOT.jar'
ENTRYPOINT java -jar -Dsever.port=8080 demo-0.0.1-SNAPSHOT.jar
