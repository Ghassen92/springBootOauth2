# Spring-oauth2-jpa-example
A simple and basic example  to secure REST APsI with authentication using Spring Boot , Security , OAuth2 and JPA.

To get the oauth tokens: 

```sh
curl -X POST  http://localhost:8080/oauth/token
  -H 'authorization: Basic bXktdHJ1c3RlZC1jbGllbnQ6c2VjcmV0' 
  -H 'content-type: application/x-www-form-urlencoded' 
  -d 'grant_type=password&password=user&username=user'

```
That's the response returned by the authentication server
```sh
{
    "access_token": "23bf1092-2216-4c17-8b4a-0b248ba8f11e",
    "token_type": "bearer",
    "refresh_token": "629030fe-f422-49c0-8880-1ab718fa20b4",
    "expires_in": 761,
    "scope": "read write trust"
} 
```
To get all users: 

```sh
curl -X GET http://localhost:8080/users 
  -H 'authorization: Bearer xxxx-xxx-xxxx-xxxx
  ' 
```


