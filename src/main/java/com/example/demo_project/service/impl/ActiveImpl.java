package com.example.demo_project.service.impl;

import org.springframework.stereotype.Service;

import com.example.demo_project.entity.Bird;
import com.example.demo_project.service.ifs.Active;

@Service
public class ActiveImpl implements Active {

	@Override
	public Bird fly(String name, int age) {
		Bird bird = new Bird();
		bird.setName(name);
		bird.setAge(age);
		return bird;
	}
	
	public void print(Bird bird) {
		System.out.println("���~"+bird.getAge()+"��"+bird.getName()+ "���b��");
		
	}

}
