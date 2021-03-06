package com.Money.EventsBeltReviewer.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import com.Money.EventsBeltReviewer.models.User;

public interface UserRepository extends CrudRepository<User, Long> {

	List<User> findAll();
	Optional<User> findById(Long id);
	User findByEmail(String email);
}
