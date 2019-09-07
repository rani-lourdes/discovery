# AWS Service Discovery

### Build
###### Build application and create local image
```
mvn clean package dockerfile:build
```

###### Build application and push image to remote repository
```
mvn clean package dockerfile:push
```

###### Run application using docker compose
```
docker-compose up
```