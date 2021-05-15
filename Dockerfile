FROM openjdk:8
COPY ./out/production/ifrs-dev1-appv1r1/ /tmp
WORKDIR /tmp
ENTRYPOINT ["java","ifrs-dev1-appv1r1"]