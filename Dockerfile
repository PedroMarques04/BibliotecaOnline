FROM maven:3.9.6-eclipse-temurin-21 AS builder
WORKDIR /app
COPY pom.xml .
COPY src ./src 
RUN mvn -DskipTests package

FROM eclipse-temurin:21-jdk
WORKDIR /app 
COPY --from=builder /app/target/*.jar app.jar 

EXPOSE 8080

# ADICIONE ESTA LINHA para verificar se o app inicia:
RUN java -version && ls -la

ENTRYPOINT ["java","-jar","app.jar"]