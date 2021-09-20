package com.Money.EventsBeltReviewer.services;

import java.util.*;

import org.springframework.stereotype.*;

import com.Money.EventsBeltReviewer.models.EventAttendee;
import com.Money.EventsBeltReviewer.repositories.EventAttendeeRepository;


@Service
public class EventAttendeeService {
	private final EventAttendeeRepository repo;
	
	public EventAttendeeService(EventAttendeeRepository repo) {
		this.repo = repo;
	}
	public List<EventAttendee> allInstances(){
		return repo.findAll();
	}
	public EventAttendee findInstance(Long id) {
		Optional<EventAttendee> optionalModel = repo.findById(id);
        if(optionalModel.isPresent()) {
            return optionalModel.get();
        } else {
            return null;
        }
	}
	public void save(EventAttendee model) {
		this.repo.save(model);
	}
	public void delete(Long id) {
		EventAttendee relationship = this.findInstance(id);
		this.repo.delete(relationship);
	}
}
