FROM openjdk:11.0-jre

WORKDIR /tmp

COPY target/payment-0.0.1-SNAPSHOT.jar /tmp/payment-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java", "-jar", "/tmp/payment-0.0.1-SNAPSHOT.jar"]

EXPOSE 9096