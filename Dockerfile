

FROM maven:3.6-jdk-8 AS build
COPY . /opt/efo/
RUN cd /opt/efo && mvn clean package -DskipTests

FROM tomcat:8-jdk8-temurin-focal
COPY --from=build /opt/efo/target/efo.war /usr/local/tomcat/webapps/


