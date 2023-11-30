FROM openjdk:17-alpine
ADD target/custapp.jar custapp.jar
ENTRYPOINT ["java","-jar","custapp.jar"]
EXPOSE 8080