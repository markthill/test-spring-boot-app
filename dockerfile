FROM java:8-jdk-alpine
VOLUME /tmp
COPY target/test-spring-boot-app-0.0.1-SNAPSHOT.jar spring-boot-test.jar
ENTRYPOINT ["java","-jar","spring-boot-test.jar"]