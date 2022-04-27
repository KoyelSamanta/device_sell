#device_sell

##End points

###sign-up

...
POST /api/authentication/sign-up HTTP/1.1
Host: localhost:8080
Content-Type: application/json

{
"name":"doyel",
"username":"doyel01",
"password":"doyel"
}
...

###sign-in

...
POST /api/authentication/sign-in HTTP/1.1
Host: localhost:8080
Content-Type: application/json

{
"username" : "user",
"password" : "user"
}
...

###change role

...
PUT /api/user/change/ADMIN HTTP/1.1
Host: localhost:8080
Authorization: Bearer eyJhbGciOiJIUzUxMiJ9
.eyJzdWIiOiJkb3llbDAxIiwicm9sZXMiOiJST0xFX1VTRVIiLCJ1c2VySWQiOjMsImV4cCI6MTY0OTY5MzMwNH0
.O5w4aQET64lISbA-rYaSWMqu_RUK0Mu-puElDMHvkdrDjc2DcSHba7QMG9mrKEzWZef4ffvoDYaIF9PS7ZMDBg
...

###add device

...
POST /api/device HTTP/1.1
Host: localhost:8080
Authorization: Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJkb3llbDAxIiwicm9sZXMiOiJST0xFX0FETUlOIiwidXNlcklkIjozLCJleHAiOjE2NDk2OTQxNDF9
.t__VzYG9pjYT8mzfxFT31xlLTT0CR6DYrehmntUZT1-nV0ed3DA1lhBe5j_v2Ak3RBFDK5YfYZZ276k2lXCMeg
Content-Type: application/json


{
"name": "Zenphone 4",
"description": "smart phone",
"price":"9000",
"deviceType":"Mobile"
}
...

###Get device

...
GET /api/device HTTP/1.1
Host: localhost:8080
Content-Type: application/json
Content-Length: 10

{

}
...

###delete device by id

...
DELETE /api/device/1 HTTP/1.1
Host: localhost:8080
Authorization: Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJkb3llbDAxIiwicm9sZXMiOiJST0xFX0FETUlOIiwidXNlcklkIjozLCJleHAiOjE2NDk3NDEyMDF9
.ICOiJYzY5LTXqV4fD_5S0MLOgLJP3zbarExdqnS5X6ARgYHLFGryGW0p8BU-DIOckUwVA9ZIYLJBU31i9FnN4w
...

###purchase device

...
POST /api/purchase HTTP/1.1
Host: localhost:8080
Authorization: Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJkb3llbDAxIiwicm9sZXMiOiJST0xFX0FETUlOIiwidXNlcklkIjozLCJleHAiOjE2NDk3NDEyMDF9
.ICOiJYzY5LTXqV4fD_5S0MLOgLJP3zbarExdqnS5X6ARgYHLFGryGW0p8BU-DIOckUwVA9ZIYLJBU31i9FnN4w
Content-Type: application/json

{
"userId":1,
"deviceId":2,
"price": 9000,
"color": "Black"
}
...

###purchase device

...
GET /api/purchase HTTP/1.1
Host: localhost:8080
Authorization: Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJ1c2VyIiwicm9sZXMiOiJST0xFX1VTRVIiLCJ1c2VySWQiOjEsImV4cCI6MTY0OTc0NDM1MX0
.yt2ZrHeczW0lB19pFnb1Bx59eG7Yx_LHrLOFEL6gE3H-3G0FiolMZx0-CtceJ4TQ9ZCbzkfyZAOIu27emgRv0Q
...