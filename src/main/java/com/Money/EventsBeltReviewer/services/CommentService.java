package com.Money.EventsBeltReviewer.services;

import java.util.*;

import org.springframework.stereotype.*;

import com.Money.EventsBeltReviewer.models.Comment;

import com.Money.EventsBeltReviewer.repositories.CommentRepository;


@Service
public class CommentService {
	private final CommentRepository repo;
	
	public CommentService(CommentRepository repo) {
		this.repo = repo;
	}
	public List<Comment> allInstances(){
		return repo.findAll();
	}
	public Comment findInstance(Long id) {
		Optional<Comment> optionalModel = repo.findById(id);
        if(optionalModel.isPresent()) {
            return optionalModel.get();
        } else {
            return null;
        }
	}
	public void save(Comment model) {
		this.repo.save(model);
	}
	public void delete(Long id) {
		Comment relationship = this.findInstance(id);
		this.repo.delete(relationship);
	}
}
