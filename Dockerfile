FROM openjdk:19-alpine
ADD target/*jar dummy-api.jar
ENTRYPOINT ["java","-jar","dummy-api.jar"]