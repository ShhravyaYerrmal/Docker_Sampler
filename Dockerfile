FROM java:8
EXPOSE 8081
ADD target/docker-demo.jar docker-demo.jar
ENTRYPOINT ["java","-jar","docker-demo.jar"]