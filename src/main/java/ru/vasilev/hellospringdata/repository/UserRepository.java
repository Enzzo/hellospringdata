package ru.vasilev.hellospringdata.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ru.vasilev.hellospringdata.model.User;

public interface UserRepository extends JpaRepository<User, Long>{

}