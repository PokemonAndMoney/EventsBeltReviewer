package com.Money.EventsBeltReviewer.repositories;

import java.util.*;


import org.springframework.data.repository.CrudRepository;
import com.Money.EventsBeltReviewer.models.EventAttendee;

public interface EventAttendeeRepository extends CrudRepository<EventAttendee, Long> {

	List<EventAttendee> findAll();

}
