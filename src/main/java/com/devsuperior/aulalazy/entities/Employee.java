package com.devsuperior.aulalazy.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_employee")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long id;
	public String name;	
	public String email;
	
	@ManyToOne // por padrão é: fetch = FetchType.EAGER
	@JoinColumn(name = "department_id") 
	public Department department;
	
	public Employee() {
	}

	public Employee(Long id, String name, String email, Department department) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.department = department;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}
}
