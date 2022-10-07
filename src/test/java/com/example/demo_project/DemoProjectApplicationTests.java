package com.example.demo_project;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo_project.entity.Bird;
import com.example.demo_project.entity.Person;
import com.example.demo_project.service.ifs.Active;
import com.example.demo_project.service.ifs.PersonService;

@SpringBootTest
class DemoProjectApplicationTests {
	
	@Autowired
	private PersonService personService;
	
	@Autowired
	private Active active;
	
	//@Test
	public void getPersonTests() {
		Person per = personService.getPersonInfo("123");
		personService.printPersonAttributes(per);
	}
	
	
	@Test
	public void getBirdTests() {
		Bird bird = active.fly("¤p³¾", 20);
		active.print(bird);
	}

}
