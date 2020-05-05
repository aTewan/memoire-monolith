package com.antoinepoirier.memoiremonolith.model;

import javax.persistence.*;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity()
@Table(name = "users")
@EntityListeners(AuditingEntityListener.class)
public class User {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "first_name", nullable = false)
    private String firstName;
    
    public long getId() {
		return id;
    }
    
    public void setId(long id) {
    	this.id = id;
    }
    
    public String getFirstName() {
    	return firstName;
    }
    
    public void setFirstName(String firstName) {
    	this.firstName = firstName;
    }
}
