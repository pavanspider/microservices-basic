package com.microservices.microservice.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservices.microservice.entity.Ecourse;
import com.microservices.microservice.repository.EcourseRepository;
import com.microservices.microservice.service.EcourseService;

import jakarta.transaction.Transactional;

@Service
public class EcourseServiceImpl implements EcourseService{
	
	@Autowired
	private EcourseRepository ecourseRepository;

	@Override
	@Transactional
	public Ecourse saveEcourse(Ecourse eCourse) {
		return ecourseRepository.save(eCourse);
	}
}
