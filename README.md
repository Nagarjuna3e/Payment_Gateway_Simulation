## Features
- Initiate dealer payment (with dealerId, amount, method)
- Auto-update status from PENDING → SUCCESS after 5 seconds
- Check payment status via REST API
- Exception handling for invalid dealerId
- Built using Spring Boot + PostgreSQL

## Endpoints
- `POST /api/payment/initiate`
- `GET /api/payment/checkStatus?dealerId={id}`

## Tech Stack
- Java 17 / Spring Boot
- SQL
- JPA / Hibernate

## How to Run
1. Clone repo
2. Configure DB in `application.properties`
3. Run the Spring Boot application
4. Use Postman to test endpoints
