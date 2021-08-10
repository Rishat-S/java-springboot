FROM openjdk:8-jdk-alpine

EXPOSE 8081

ADD target/SpringBootDemo-0.0.1-SNAPSHOT.jar myapp.jar

ENTRYPOINT ["java", "-jar", "/mayapp.jar"]