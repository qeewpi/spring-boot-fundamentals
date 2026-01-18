package com.asrmanalo.store.repositories;

import com.asrmanalo.store.entities.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}