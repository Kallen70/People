package com.example.services;

import com.example.entities.User;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by kevinallen on 3/17/17.
 */
public interface UserRepository extends CrudRepository<User, Integer> {
}
