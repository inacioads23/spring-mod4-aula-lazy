package com.devsuperior.aulalazy.repositories;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.devsuperior.aulalazy.entities.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

	//            alias     Entity alias trazer junto o departamento
	@Query("SELECT obj FROM Employee obj JOIN FETCH obj.department")
	List<Employee> findEmployeesWithDepartments();

	// JPA Query Methods - https://docs.spring.io/spring-data/jpa/reference/jpa/query-methods.html
	List<Employee> findByNameIgnoreCase(String name); // Ignora maiúscula/ minúscula
	
	// JPA Query Methods - https://docs.spring.io/spring-data/jpa/reference/jpa/query-methods.html
	List<Employee> findByNameContainingIgnoreCase(String name); // pesquisa por parte do texto, Ignora maiúscula/ minúscula
}
