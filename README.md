# Order Service
> MICROSERVICES DEVELOPMENT & API <br>
> Exercício 1 - Spring Boot


## Endpoints

#####POST - localhost:8080/order-service

```
{
   "name": "Nome Completo",
   "email": "nome.sobrenome@dominio.com",
   "shippingAddress": "Endereço teste",
   "orderItemDTOS": [
      {
         "id": 1,
         "name": "Nome Item 1",
         "price": 5
      },
      {
         "id": 2,
         "name": "Nome Item 2",
         "price": 10
      }
   ],
   "totalPrice": 15,
   "paymentDTO": {
      "id": 1,
      "idTransaction": "aaaa12-bbbb32-cccc43-dddd56",
      "cardExpirationDate": "2019-03-23",
      "cardNumber": 123478964567821,
      "cardFlag": "VISA"
   },
   "orderDate": "2019-03-23",
   "status": "Ativo"
}
```

#####PUT - localhost:8080/order-service/1

```
{
   "name": "Nome Completo",
   "email": "nome.sobrenome@dominio.com",
   "shippingAddress": "Endereço teste",
   "orderItemDTOS": [
      {
         "id": 1,
         "name": "Nome Item 1",
         "price": 5
      },
      {
         "id": 2,
         "name": "Nome Item 2",
         "price": 10
      }
   ],
   "totalPrice": 15,
   "paymentDTO": {
      "id": 1,
      "idTransaction": "aaaa12-bbbb32-cccc43-dddd56",
      "cardExpirationDate": "2019-03-23",
      "cardNumber": 123478964567821,
      "cardFlag": "VISA"
   },
   "orderDate": "2019-03-23",
   "status": "Ativo"
}
```

#####GET - localhost:8080/order-service/1

```
{
   "name": "Nome Completo",
   "email": "nome.sobrenome@dominio.com",
   "shippingAddress": "Endereço teste",
   "orderItemDTOS": [
      {
         "id": 1,
         "name": "Nome Item 1",
         "price": 5
      },
      {
         "id": 2,
         "name": "Nome Item 2",
         "price": 10
      }
   ],
   "totalPrice": 15,
   "paymentDTO": {
      "id": 1,
      "idTransaction": "aaaa12-bbbb32-cccc43-dddd56",
      "cardExpirationDate": "2019-03-23",
      "cardNumber": 123478964567821,
      "cardFlag": "VISA"
   },
   "orderDate": "2019-03-23",
   "status": "Ativo"
}
```

#####DELETE - localhost:8080/order-service/1

