# password_validator
It is spring boot web application. Result is REST API for password validation.

For REST API is available Swagger representation: 
    http://127.0.0.1:9003/api/swagger-ui.html

Run tests:
    mvn test
    
REST API:
    1.  GET validate password 
        http://127.0.0.1:9003/api/password/validate?password="password"
        
        Response body:
        {
          "valid": true/false,
          "message": "validation error message" // this field is present if password is invalid
        }
        
Also it will be good to add encoding/decoding password for request parameter. 