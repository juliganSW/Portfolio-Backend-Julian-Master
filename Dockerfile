
FROM amazoncorretto:19-alpine

COPY target/Portfolio-0.0.1-SNAPSHOT.jar app.jar 

ENTRYPOINT ["java","-jar","/app.jar"]
