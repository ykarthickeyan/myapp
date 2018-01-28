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