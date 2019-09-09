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

### Run
###### Local
Message Service
```
VM Options: -Dserver.port=8010 -Dmanagement.server.port=8011
```

Welcome Service
```
VM Options: -Dapp.feign.url=http://localhost:8010/
```

###### docker compose
```
docker-compose up
```

### Test
###### Local
Message Service
```
http://localhost:8010/message
http://localhost:8011/actuator/health
```

Welcome Service
```
http://localhost:8000/welcome
http://localhost:8001/actuator/health
```