# Проект hello-spring-data

## Описание
Проект демонстрирует использование Spring Data JPA и PostgreSQL для реализации CRUD-операций.

## Технологии
- Spring Boot
- Spring Data JPA
- PostgreSQL
- Docker Compose

## Профили
- **dev**: Использует базу `dev_db` (логин/пароль: `postgres-dev/postgres-dev`).
- **prod**: Использует базу `prod_db` (логин/пароль: `postgres-prod/postgres-prod`).

## Команды запуска
- Поднять PostgreSQL:
  ```bash
  docker-compose up -d
  
  ## Работа с REST API

### Доступные эндпоинты
GET	/users	Получить список всех пользователей

GET	/users{id}	Получить пользователя по id

POST /users	Создать нового пользователя

PUT	/users/{id}	Обновить данные пользователя

DELETE /users/{id}	Удалить пользователя

### Примеры запросов

```bash
Получить список всех пользователей
curl -X GET http://localhost:8080/users

Получить пользователя where id=1
curl -X GET http://localhost:8080/users/1

Изменить пользователя с id=3
curl -X PUT http://localhost:8080/users/3 \
-H "Content-Type: application/json" \
-d '{"name": "updated user", "email": "updated@mail.com"}'

Создать нового пользователя
curl -X POST http://localhost:8080/users \
-H "Content-Type: application/json" \
-d '{"name": "new user", "email": "new@gmail.com"}'

Удалить пользователя с id=3
curl -X DELETE http://localhost:8080/users/3
```

  