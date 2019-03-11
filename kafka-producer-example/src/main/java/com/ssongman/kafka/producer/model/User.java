package com.ssongman.kafka.producer.model;

public class User {
	private String name;
	private String depte;
	private Long salary;
	
	public User(String name, String depte, Long salary) {
		super();
		this.name = name;
		this.depte = depte;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepte() {
		return depte;
	}

	public void setDepte(String depte) {
		this.depte = depte;
	}

	public Long getSalary() {
		return salary;
	}

	public void setSalary(Long salary) {
		this.salary = salary;
	}
	
	
	
	

}
