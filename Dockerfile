FROM openjdk:11
VOLUME /tmp
COPY target/*.jar demo-basic-spring.jar
ENTRYPOINT ["java", "-jar", "/demo-basic-spring.jar"]