package com.example.demo_project.service.ifs;

import com.example.demo_project.entity.Person;

public interface PersonService {

	 public Person getPersonInfo(String id);
	 
	 public void printPersonAttributes(Person person);
}
