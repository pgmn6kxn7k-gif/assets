# assets

This project is initialized with Apache Apex for stream processing.

## Prerequisites
- Java 8+
- Maven 3.3+
- Apache Hadoop/YARN (for cluster deployment) or local mode for development

## Build
mvn clean compile

## Run Locally
mvn exec:java -Dexec.mainClass="com.example.MyApp" -Dexec.args="local"

## Deploy to Cluster
apex submit target/apex-app-1.0-SNAPSHOT.apex

## Usage
This is a basic Apache Apex application with a sample operator that processes strings.

## Troubleshooting
- Ensure JAVA_HOME is set.
- For cluster mode, configure Hadoop/YARN.
- Check logs in logs/ directory.