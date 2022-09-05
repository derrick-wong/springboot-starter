FROM eclipse-temurin:11
RUN addgroup --system spring && adduser --system spring && usermod -aG spring spring
USER spring:spring
ARG JAR_FILE=build/libs/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]