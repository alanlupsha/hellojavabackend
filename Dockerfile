FROM openjdk:11-jre-slim
VOLUME /tmp
COPY /target/hellojavabackend-*.jar hellojavabackend.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/hellojavabackend.jar"]
