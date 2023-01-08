FROM openjdk:19-alpine
ADD target/*jar dummy-project-0.0.1.jar
ENTRYPOINT ["java","-jar","/dummy-project-0.0.1.jar"]