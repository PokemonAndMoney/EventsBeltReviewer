package com.Money.EventsBeltReviewer.repositories;



import java.util.*;

import org.springframework.data.repository.CrudRepository;
import com.Money.EventsBeltReviewer.models.Comment;

public interface CommentRepository extends CrudRepository<Comment, Long> {
	List<Comment> findAll();
}
