# Spring-Task
SQL схема Базы данных

CREATE TABLE Client (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL
);

CREATE TABLE Contact (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    client_id BIGINT,
    type VARCHAR(10) NOT NULL, -- 'phone' или 'email'
    value VARCHAR(255) NOT NULL,
    FOREIGN KEY (client_id) REFERENCES Client(id) ON DELETE CASCADE
);

API:
1) Добавление нового клиента (POST /clients)
2) Добавление нового контакта клиента (POST /contacts?clientId=ID)
3) Получение списка клиентов (GET /clients)
4) Получение информации по заданному клиенту (по id) (GET /clients/{id})
5) Получение списка контактов заданного клиента (GET /contacts/client/{clientId})
6) Получение списка контактов заданного типа заданного клиена (GET /contacts/client/{clientId}/{type})
