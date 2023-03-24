FROM openjdk
WORKDIR /app
COPY build/libs/product-consumer-0.0.1-SNAPSHOT.jar /app/product-consumer.jar
ENTRYPOINT ["java","-jar","product-consumer.jar"]
