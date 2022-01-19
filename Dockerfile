FROM openjdk:8-jdk-alpine
COPY "./target/monto-backend-apirest-0.0.1-SNAPSHOT.jar" "app.jar"
expose 9000
ENTRYPOINT ["java","-jar","app.jar"]