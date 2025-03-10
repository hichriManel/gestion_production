FROM openjdk:21-jdk
# Set the working directory in the container
WORKDIR /app

# Copy the jar file into the container at /app
COPY target/login-0.0.1-SNAPSHOT.jar /app/login-0.0.1-SNAPSHOT.jar

# Make port 8080 available to the world outside this container
EXPOSE 7070

# Run the jar file
ENTRYPOINT ["java", "-jar", "login-0.0.1-SNAPSHOT.jar"]

