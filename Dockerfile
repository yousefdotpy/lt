FROM openjdk:17
LABEL maintainer="leaptech"
ADD target/LeapTech-0.0.1-SNAPSHOT.jar LeapTech-docker.jar
ENTRYPOINT ["java","-jar","LeapTech-docker.jar"]