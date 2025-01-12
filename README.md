# Проект hello-spring-data

## Описание
Проект демонстрирует использование Spring Data JPA и PostgreSQL для реализации CRUD-операций.

## Технологии
- Spring Boot
- Spring Data JPA
- PostgreSQL
- Docker Compose

## Профили
- **dev**: Использует базу `mydb` (логин/пароль: `admin/admin`).
- **prod**: Использует базу `prod_db` (логин/пароль: `prod_user/prod_pass`).

## Команды запуска
- Поднять PostgreSQL:
  ```bash
  docker-compose up -d