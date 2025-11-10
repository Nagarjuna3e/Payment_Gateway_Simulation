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




## 1. Database Table
<img width="1920" height="1080" alt="Screenshot (81)" src="https://github.com/user-attachments/assets/44f07a94-b485-4c51-8b24-3c39fd6cf638" />

## 2. Initiate Payment (Pending)
<img width="1920" height="1080" alt="Screenshot (82)" src="https://github.com/user-attachments/assets/2adcdbf3-dcac-4a7f-a205-c965080d8f49" />

<img width="1920" height="1080" alt="Screenshot (84)" src="https://github.com/user-attachments/assets/c7602bc7-5f8e-4ab3-8e64-7c2b6469e933" />



## 3. Check Status (Success)
<img width="1920" height="1080" alt="Screenshot (83)" src="https://github.com/user-attachments/assets/2febe85e-4dba-4596-8f51-ca7bcab3c206" />

## 4. Check Status using new endpoint
<img width="1920" height="1080" alt="Screenshot (85)" src="https://github.com/user-attachments/assets/0280f276-7e9a-4dd5-a9df-f076a84404a9" />

## 5. Check Status in console
<img width="1920" height="1080" alt="Screenshot (86)" src="https://github.com/user-attachments/assets/74c05c2c-ece2-4554-8d51-eaef41a64cba" />

