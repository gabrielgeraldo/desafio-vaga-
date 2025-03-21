package com.desafio_vaga_picpay.repository;

import com.desafio_vaga_picpay.domain.user.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
  Optional<User> findUserByDocument(String document);
  Optional<User> findUserById(Long id);
}
