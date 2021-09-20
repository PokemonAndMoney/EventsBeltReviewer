package com.Money.EventsBeltReviewer.services;

import java.util.*;

import org.springframework.stereotype.*;

import com.Money.EventsBeltReviewer.models.Event;

import com.Money.EventsBeltReviewer.repositories.EventRepository;


@Service
public class EventService {
	private final EventRepository repo;
	
	public EventService(EventRepository repo) {
		this.repo = repo;
	}
	public List<Event> allInstances(){
		return repo.findAll();
	}
	public Event findInstance(Long id) {
		Optional<Event> optionalModel = repo.findById(id);
        if(optionalModel.isPresent()) {
            return optionalModel.get();
        } else {
            return null;
        }
	}
	public void save(Event model) {
		this.repo.save(model);
	}
	public void delete(Long id) {
		Event relationship = this.findInstance(id);
		this.repo.delete(relationship);
	}
}
