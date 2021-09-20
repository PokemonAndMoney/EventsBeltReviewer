package com.Money.EventsBeltReviewer.models;
import java.util.*;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.Size;

@Entity
@Table(name="users")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Email
	private String email;
	@Size(min=8, max=200)
	private String password;
	
	@OneToMany(mappedBy="user", fetch = FetchType.LAZY)
	private List<Event> events;
	
	@OneToMany(mappedBy="user", fetch = FetchType.LAZY)
	private List<EventAttendee> eventsAttending;
	
	@OneToMany(mappedBy="user", fetch = FetchType.LAZY)
	private List<Comment> comments;
	
	public List<Event> getEvents() {
		return events;
	}


	public void setEvents(List<Event> events) {
		this.events = events;
	}


	public List<EventAttendee> getEventsAttending() {
		return eventsAttending;
	}


	public void setEventsAttending(List<EventAttendee> eventsAttending) {
		this.eventsAttending = eventsAttending;
	}


	public List<Comment> getComments() {
		return comments;
	}


	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}


	public String getPassConfirm() {
		return passConfirm;
	}


	public void setPassConfirm(String passConfirm) {
		this.passConfirm = passConfirm;
	}


	private Boolean isAdmin = false;
	
	@Column(updatable=false)
	public Date createdAt;
	public Date updatedAt;
	
	
	//getters and setters...
	
	
	@Transient
	private String passConfirm;
	
	@PrePersist
    protected void onCreate(){
        this.createdAt = new Date();
    }

	
    @PreUpdate
    protected void onUpdate(){
        this.updatedAt = new Date();
    }


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public Boolean getIsAdmin() {
		return isAdmin;
	}


	public void setIsAdmin(Boolean isAdmin) {
		this.isAdmin = isAdmin;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}
	
}