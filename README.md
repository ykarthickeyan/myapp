# MYAPP

This is a project used to test with Docker. Feel free to clone and add more APIs. It uses Spring boot with H2 db

## Installing and running

## Getting started
### Create a employee
    POST
    "employee/createEmployee"

    {
    "id":1,
    "name":"karthickeyan",
    "age": 75
    }

### Get all employees

    GET
    "employee/getAllEmployees"
    
### Running the docker file
Build the docker image

    docker image build -t myapp:1 .

Run the docker container
    
    docker container run -p 8080:8080 --name myapp myapp:1

### Running the docker container using the image built by maven plugin
    mvn clean install dockerfile:build 
    
Run the docker container
    
    docker container run -p 8080:8080 --name myapp myapp:1    
    
