package com.Money.EventsBeltReviewer.repositories;

import java.util.*;


import org.springframework.data.repository.CrudRepository;
import com.Money.EventsBeltReviewer.models.Event;

public interface EventRepository extends CrudRepository<Event, Long> {

	List<Event> findAll();
}
