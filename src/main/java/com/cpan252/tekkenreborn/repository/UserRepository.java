package com.cpan252.tekkenreborn.repository;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;

import com.cpan252.tekkenreborn.model.User;


@Repository
public interface UserRepository extends CrudRepository<User, Long> {
    User findByUsername(String username);
}