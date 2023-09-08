package com.microservices.microservice.controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.microservice.dto.EcourseDto;
import com.microservices.microservice.entity.Ecourse;
import com.microservices.microservice.service.EcourseService;

@RestController
@RequestMapping("/ecourseCourse")
public class EcourseController {
	
	@Autowired
	private ModelMapper modelMapper;
	
	@Autowired
	private EcourseService ecourseService;
	
	@PostMapping("/save")
	public EcourseDto saveEcourse(@RequestBody EcourseDto ecourseDto) {
		Ecourse ecourse = new Ecourse();
		ecourse.setName(ecourseDto.getName());
		ecourse.setType(ecourseDto.getType());
		ecourse.setAvailable(ecourseDto.isAvailable());
		ecourseService.saveEcourse(ecourse);
		return modelMapper.map(ecourse, EcourseDto.class);
	}
}
