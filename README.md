# hello-docker

# Construir projeto Maven
# mvn clean package -DskipTests

# docker build -t hello-docker:0.0.1-SNAPSHOT .
# docker tag hello-docker:0.0.1-SNAPSHOT jacksoncalixto/hello-docker:0.0.1-SNAPSHOT
# docker login docker.io
# docker push jacksoncalixto/hello-docker:0.0.1-SNAPSHOT

# Troubleshoot / reset factory default
# docker run jacksoncalixto/hello-docker:0.0.1-SNAPSHOT
# docker run -p 80:80 -d jacksoncalixto/hello-docker:0.0.1-SNAPSHOT
# docker container ls
# docker logs 
# docker logs -f
# docker search mysql --filter is-official=true
