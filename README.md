# hello-docker

# Construir projeto Maven
# mvn clean package -DskipTests

# docker build -t hello-docker:0.0.1-SNAPSHOT .
# docker tag hello-docker:0.0.1-SNAPSHOT jacksoncalixto/hello-docker:0.0.1-SNAPSHOT
# docker tag jacksoncalixto/hello-docker:0.0.2-SNAPSHOT jacksoncalixto/hello-docker:latest
# docker login docker.io
# docker push jacksoncalixto/hello-docker:0.0.1-SNAPSHOT
# docker push jacksoncalixto/hello-docker:latest

# Troubleshoot / reset factory default
# docker run -p 80:80 -d jacksoncalixto/hello-docker:0.0.1-SNAPSHOT
# docker run -p 81:80 -d jacksoncalixto/hello-docker
# docker container ls
# docker logs 
# docker logs -f
# docker search mysql --filter is-official=true
# docker pull mariadb
# docker image history mariadb
# docker image inspect mariadb
# docker image remove mariadb / docker rmi mariadb

# docker container ls
# docker container pause 
# docker container unpause 
# docker stop 
# docker container ls -a
# docker container prune 
# docker container kill
# docker run -p 80:80 -d --restart=always jacksoncalixto/hello-docker
