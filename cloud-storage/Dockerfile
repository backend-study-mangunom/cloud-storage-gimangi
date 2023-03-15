FROM openjdk:11-jre
COPY build/libs/cloud-storage-0.0.1-SNAPSHOT-plain.jar cloud-storage.jar
LABEL "Description" = "Cloud Storage Service Backend"
ENTRYPOINT ["java", "-jar", "cloud-storage.jar"]