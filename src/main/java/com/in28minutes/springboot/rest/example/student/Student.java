package com.in28minutes.springboot.rest.example.student;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity //Specifies that the class is an entity. This annotation is applied to the entity class.
public class Student {
	@Id //Specifies the primary key of an entity.
	@GeneratedValue(strategy = GenerationType.IDENTITY) //Provides for the specification of generation strategies for the values of primary keys.
	private Long id;

	@Size(min = 3, max = 8, message="El nombre debe de tener mínimo 3 carácteres y máximo 20")
	@NotEmpty(message="El nombre del estudiante es obligatorio")
	private String name;
	private String passportNumber;
	
	public Student() {
		super();
	}

	public Student(Long id, String name, String passportNumber) {
		super();
		this.id = id;
		this.name = name;
		this.passportNumber = passportNumber;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassportNumber() {
		return passportNumber;
	}

	public void setPassportNumber(String passportNumber) {
		this.passportNumber = passportNumber;
	}
		
}
