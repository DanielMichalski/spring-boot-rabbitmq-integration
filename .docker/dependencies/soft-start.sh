#!/bin/bash

# This script can be used to rebuild the project and refresh/restart the docker container in one go

docker-compose build
docker-compose up -d
