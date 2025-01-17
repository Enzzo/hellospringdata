package ru.vasilev.hellospringdata.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ru.vasilev.hellospringdata.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}