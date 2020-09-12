# one for all conductor with debug port
docker run --rm -p 8080:8080 -p 5000:5000 -p 5005:5005 -eloadSample=false  docker.io/s50600822/conductor-su:sep092020

# mount host /tmp/config.properties file into the container and use it
#docker run -v "/tmp:/app/config/" --rm -p 8080:8080 -p 5000:5000 -p 5005:5005 -eCONFIG_PROP=config.properties  docker.io/s50600822/conductor-su:sep092020
