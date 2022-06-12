All requests

1. Create user
curl --location --request POST 'localhost:9000/api/user/create' \
--header 'Content-Type: application/json' \
--data-raw '{
    "username": "acer"
}'


2. Create chat
curl --location --request POST 'localhost:9000/api/chat/create' \
--header 'Content-Type: application/json' \
--data-raw '{
    "name": "chat2",
    "usersArray": [2,3]
}'


3. Create message
curl --location --request POST 'localhost:9000/api/message/create' \
--header 'Content-Type: application/json' \
--data-raw '{
    "text": "Hello2",
    "authorId": 1,
    "chatId": 1
}'


4. Get all chats by user id
curl --location --request GET 'localhost:9000/api/chat/get/userId=2'


5. Get all messages by chat id
curl --location --request GET 'localhost:9000/api/message/get/chatId=1'
