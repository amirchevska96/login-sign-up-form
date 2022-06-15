FROM openjdk:17-jdk-alpine

EXPOSE 8080

ADD demo/target/demo-0.0.1-SNAPSHOT.jar /demo-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java","-jar","demo-0.0.1-SNAPSHOT.jar"]