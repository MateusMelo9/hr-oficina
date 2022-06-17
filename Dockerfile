FROM openjdk:11
VOLUME /tmp
ADD ./target/hr-oficina-0.0.1-SNAPSHOT.jar hr-oficina.jar
ENTRYPOINT ["java","-jar","/hr-oficina.jar"]